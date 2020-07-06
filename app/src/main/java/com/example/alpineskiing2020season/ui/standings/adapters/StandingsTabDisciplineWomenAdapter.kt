package com.example.alpineskiing2020season.ui.standings.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.alpineskiing2020season.ui.standings.men.StandingsMenFragment
import com.example.alpineskiing2020season.ui.standings.men.discipline.StandingsDhMenFragment
import com.example.alpineskiing2020season.ui.standings.women.StandingsWomenFragment
import com.example.alpineskiing2020season.ui.standings.women.discipline.StandingsDhWomenFragment
import com.example.alpineskiing2020season.ui.standings.women.discipline.StandingsGsWomenFragment
import com.example.alpineskiing2020season.ui.standings.women.discipline.StandingsOvrWomenFragment

class StandingsTabDisciplineWomenAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {

            0 -> StandingsOvrWomenFragment()

            1 -> StandingsGsWomenFragment()

            2 -> StandingsDhWomenFragment()

            else -> StandingsOvrWomenFragment()
        }
    }
}