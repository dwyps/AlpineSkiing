package com.example.alpineskiing2020season.ui.standings

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.alpineskiing2020season.R
import com.example.alpineskiing2020season.ui.standings.adapters.StandingsTabGenderAdapter
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.standings_fragment.*

class StandingsFragment : Fragment(R.layout.standings_fragment) {

    private lateinit var viewPagerAdapter: StandingsTabGenderAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        initViewPager()
    }

    private fun initViewPager() {

        viewPagerAdapter = StandingsTabGenderAdapter(this)

        standings_view_pager.apply {
            adapter = viewPagerAdapter
            isUserInputEnabled = false
            requestDisallowInterceptTouchEvent(true)
        }

        TabLayoutMediator(standings_tab_layout, standings_view_pager) { tab, position ->

            when(position) {

                0 -> {
                    tab.text = "Men"
                }

                1 -> {
                    tab.text = "Women"
                }
            }
        }.attach()
    }
}