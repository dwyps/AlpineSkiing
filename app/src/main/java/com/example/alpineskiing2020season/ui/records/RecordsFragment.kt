package com.example.alpineskiing2020season.ui.records

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.data.model.Record
import com.example.alpineskiing2020season.ui.events.EventsViewModel
import com.example.alpineskiing2020season.ui.events.adapters.EventsRecyclerAdapter
import com.example.alpineskiing2020season.ui.records.adapters.RecordsRecyclerAdapter
import com.example.alpineskiing2020season.util.InjectorUtils
import kotlinx.android.synthetic.main.events_fragment.*
import kotlinx.android.synthetic.main.records_fragment.*

class RecordsFragment : Fragment(R.layout.records_fragment) {

    private lateinit var recyclerViewAdapter: RecordsRecyclerAdapter

    private val recordsViewModel: RecordsViewModel by viewModels {
        InjectorUtils.provideViewModelFactory()
    }

    private val handler = Handler()
    private lateinit var runnable: Runnable

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        recordsViewModel.getRecords()
        recordsViewModel.records.observe(viewLifecycleOwner, Observer {

            recyclerViewAdapter.submitList(it)
            recyclerViewAdapter.notifyDataSetChanged()
        })

        records_refresh_layout.setOnRefreshListener {

            recyclerViewAdapter.notifyDataSetChanged()
            records_refresh_layout.isRefreshing = false
        }
    }

    override fun onResume() {
        super.onResume()

        setSpinner()

        runnable = Runnable {

            setSpinner()

            recyclerViewAdapter.notifyDataSetChanged()

            if (recyclerViewAdapter.currentList.isEmpty())
                handler.postDelayed(runnable,2000)
        }

        handler.postDelayed(runnable, 2000)
    }

    override fun onPause() {
        handler.removeCallbacks(runnable)
        super.onPause()
    }

    private fun setSpinner() {

        if (recyclerViewAdapter.currentList.isNotEmpty())
            records_spinner.visibility = View.GONE
        else
            records_spinner.visibility = View.VISIBLE
    }


    private fun initRecyclerView() {

        records_recycler_view.apply {

            recyclerViewAdapter = RecordsRecyclerAdapter()

            adapter = recyclerViewAdapter
        }
    }
}