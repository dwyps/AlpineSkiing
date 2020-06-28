package com.example.alpineskiing2020season.ui.standings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.data.model.Country
import com.example.alpineskiing2020season.data.model.Racer
import com.example.alpineskiing2020season.ui.standings.adapters.StandingsRecyclerAdapter
import kotlinx.android.synthetic.main.standings_recycler_view_fragment.*
import java.net.URL

class StandingsDisciplineFragment : Fragment(R.layout.standings_recycler_view_fragment) {

    private lateinit var standingsRecyclerAdapter: StandingsRecyclerAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initRecyclerView()

        val standingsList = arrayListOf<Racer>()

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsList.add(
            Racer(
                Country("NOR", URL(" https://cdn.countryflags.com/thumbs/norway/flag-square-500.png")),
                "0001",
                URL("https://data.fis-ski.com/general/load-competitor-picture/137380.html"),
                "Aamodt Kilde",
                "Aleksander",
                "1.",
                1202))

        standingsRecyclerAdapter.submitList(standingsList)

    }

    private fun initRecyclerView() {

        standings_recycler_view.apply {

            standingsRecyclerAdapter = StandingsRecyclerAdapter()

            adapter = standingsRecyclerAdapter
        }
    }
}