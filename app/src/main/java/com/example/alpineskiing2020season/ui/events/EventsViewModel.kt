package com.example.alpineskiing2020season.ui.events

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.data.repository.Repository

class EventsViewModel (
    private val repository: Repository
) : ViewModel() {

    private val mEvents: MutableLiveData<MutableList<Event>> = MutableLiveData()
    val events: LiveData<MutableList<Event>> = mEvents


    fun getEvents() {

        mEvents.value = repository.getEvents()
    }


}