package com.example.alpineskiing2020season.ui.standings.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.alpineskiing2020season.ui.standings.StandingsDisciplineFragment
import com.example.alpineskiing2020season.ui.standings.StandingsGenderFragment

class StandingsTabDisciplineAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return StandingsDisciplineFragment()
    }
}