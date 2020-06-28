package com.example.alpineskiing2020season.ui.standings.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.alpineskiing2020season.ui.standings.StandingsGenderFragment

class StandingsTabGenderAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return StandingsGenderFragment()
    }
}