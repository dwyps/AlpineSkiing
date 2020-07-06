package com.example.alpineskiing2020season.ui.standings.men.discipline

import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.data.model.Country
import com.example.alpineskiing2020season.data.model.Racer
import com.example.alpineskiing2020season.ui.events.EventsViewModel
import com.example.alpineskiing2020season.ui.standings.StandingsViewModel
import com.example.alpineskiing2020season.ui.standings.adapters.StandingsRecyclerAdapter
import com.example.alpineskiing2020season.util.InjectorUtils
import kotlinx.android.synthetic.main.standings_recycler_view_fragment.*
import java.net.URL

class StandingsDhMenFragment : Fragment(R.layout.standings_recycler_view_fragment) {

    private lateinit var standingsRecyclerAdapter: StandingsRecyclerAdapter

    private val standingsViewModel: StandingsViewModel by viewModels {
        InjectorUtils.provideViewModelFactory()
    }

    private val handler = Handler()
    private lateinit var runnable: Runnable

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        standingsViewModel.getDhMen()
        standingsViewModel.standings.observe(viewLifecycleOwner, Observer {

            standingsRecyclerAdapter.submitList(it)
            standingsRecyclerAdapter.notifyDataSetChanged()
        })

        standings_refresh_layout.setOnRefreshListener {

            standingsRecyclerAdapter.notifyDataSetChanged()
            standings_refresh_layout.isRefreshing = false
        }
    }

    override fun onResume() {
        super.onResume()

        setSpinner()

        runnable = Runnable {

            setSpinner()

            standingsRecyclerAdapter.notifyDataSetChanged()

            if (standingsRecyclerAdapter.currentList.isEmpty())
                handler.postDelayed(runnable,2000)
        }

        handler.postDelayed(runnable, 2000)
    }

    override fun onPause() {
        handler.removeCallbacks(runnable)
        super.onPause()
    }

    private fun setSpinner() {

        if (standingsRecyclerAdapter.currentList.isNotEmpty())
            standings_spinner.visibility = View.GONE
        else
            standings_spinner.visibility = View.VISIBLE
    }

    private fun initRecyclerView() {

        standings_recycler_view.apply {

            standingsRecyclerAdapter = StandingsRecyclerAdapter()

            adapter = standingsRecyclerAdapter
        }
    }
}