package com.example.alpineskiing2020season.ui.events

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.ui.events.adapters.EventsRecyclerAdapter
import kotlinx.android.synthetic.main.events_fragment.*
import java.net.URL

class EventsFragment : Fragment(R.layout.events_fragment) {

    private lateinit var recyclerViewAdapter: EventsRecyclerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        val eventsList = arrayListOf<Event>()

        eventsList.add(Event(
            "26-27 Oct 2019",
            URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png"),
            "Soelden, AUT",
            "GS",
            "WC",
            women = false,
            men = true
        ))
        eventsList.add(Event(
            "26-27 Oct 2019",
            URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png"),
            "Soelden, AUT",
            "GS",
            "WC",
            women = true,
            men = true
        ))
        eventsList.add(Event(
            "26-27 Oct 2019",
            URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png"),
            "Soelden, AUT",
            "GS",
            "WC",
            women = false,
            men = false
        ))
        eventsList.add(Event(
            "26-27 Oct 2019",
            URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png"),
            "Soelden, AUT",
            "GS",
            "WC",
            women = true,
            men = false
        ))

        recyclerViewAdapter.submitList(eventsList)

    }

    private fun initRecyclerView() {

        events_recycler_view.apply {

            recyclerViewAdapter = EventsRecyclerAdapter()

            adapter = recyclerViewAdapter
        }
    }
}