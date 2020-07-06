package com.example.alpineskiing2020season.util

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.alpineskiing2020season.data.repository.Repository
import com.example.alpineskiing2020season.ui.events.EventsViewModel
import com.example.alpineskiing2020season.ui.records.RecordsViewModel
import com.example.alpineskiing2020season.ui.standings.StandingsViewModel

class ViewModelFactory (
    private val repository: Repository
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {

        return when {
            modelClass.isAssignableFrom(StandingsViewModel::class.java) -> StandingsViewModel(repository) as T
            modelClass.isAssignableFrom(EventsViewModel::class.java) -> EventsViewModel(repository) as T
            modelClass.isAssignableFrom(RecordsViewModel::class.java) -> RecordsViewModel(repository) as T
            else -> throw IllegalArgumentException("Wrong dependency")
        }
    }
}