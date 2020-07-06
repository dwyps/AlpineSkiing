package com.example.alpineskiing2020season.ui.standings.adapters

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.alpineskiing2020season.ui.standings.men.discipline.StandingsDhMenFragment
import com.example.alpineskiing2020season.ui.standings.men.discipline.StandingsGsMenFragment
import com.example.alpineskiing2020season.ui.standings.men.discipline.StandingsOvrMenFragment

class StandingsTabDisciplineMenAdapter (fragment: Fragment) : FragmentStateAdapter(fragment) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {

            0 -> StandingsOvrMenFragment()

            1 -> StandingsGsMenFragment()

            2 -> StandingsDhMenFragment()

            else -> StandingsOvrMenFragment()
        }
    }
}