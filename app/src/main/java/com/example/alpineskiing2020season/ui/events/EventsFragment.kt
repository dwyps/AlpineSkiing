package com.example.alpineskiing2020season.ui.events

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.View
import androidx.core.os.postDelayed
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.ui.events.adapters.EventsRecyclerAdapter
import com.example.alpineskiing2020season.util.InjectorUtils
import kotlinx.android.synthetic.main.events_fragment.*
import kotlinx.android.synthetic.main.standings_recycler_view_fragment.*
import java.net.URL

class EventsFragment : Fragment(R.layout.events_fragment) {

    private lateinit var recyclerViewAdapter: EventsRecyclerAdapter

    private val eventsViewModel: EventsViewModel by viewModels {
        InjectorUtils.provideViewModelFactory()
    }

    private val handler = Handler()
    private lateinit var runnable: Runnable

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        eventsViewModel.getEvents()
        eventsViewModel.events.observe(viewLifecycleOwner, Observer {

            recyclerViewAdapter.submitList(it)
            recyclerViewAdapter.notifyDataSetChanged()
        })

        events_refresh_layout.setOnRefreshListener {

            recyclerViewAdapter.notifyDataSetChanged()
            events_refresh_layout.isRefreshing = false
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
            events_spinner.visibility = View.GONE
        else
            events_spinner.visibility = View.VISIBLE
    }

    private fun initRecyclerView() {

        events_recycler_view.apply {

            recyclerViewAdapter = EventsRecyclerAdapter()

            adapter = recyclerViewAdapter
        }
    }
}