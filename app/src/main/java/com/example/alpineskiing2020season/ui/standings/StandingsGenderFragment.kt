package com.example.alpineskiing2020season.ui.standings

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.ui.standings.adapters.StandingsTabDisciplineAdapter
import com.example.alpineskiing2020season.ui.standings.adapters.StandingsTabGenderAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.standings_fragment.*
import kotlinx.android.synthetic.main.standings_view_pager_fragment.*

class StandingsGenderFragment : Fragment(R.layout.standings_view_pager_fragment) {

    private lateinit var viewPagerAdapter: StandingsTabDisciplineAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewPager()

    }

    private fun initViewPager() {

        viewPagerAdapter = StandingsTabDisciplineAdapter(this)

        standings_view_pager_smaller.apply {
            adapter = viewPagerAdapter
            isUserInputEnabled = false
            requestDisallowInterceptTouchEvent(true)
        }

        TabLayoutMediator(standings_tab_layout_smaller, standings_view_pager_smaller) { tab, position ->

            when(position) {

                0 -> {
                    tab.text = "OVR"
                }

                1 -> {
                    tab.text = "GS"
                }

                2 -> {
                    tab.text = "DH"
                }
            }

        }.attach()
    }

}