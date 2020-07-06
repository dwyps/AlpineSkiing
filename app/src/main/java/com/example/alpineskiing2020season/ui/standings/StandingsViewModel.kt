package com.example.alpineskiing2020season.ui.standings

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alpineskiing2020season.data.model.Event
import com.example.alpineskiing2020season.data.model.Racer
import com.example.alpineskiing2020season.data.repository.Repository

class StandingsViewModel (
    private val repository: Repository
) : ViewModel() {

    private val mStandings: MutableLiveData<MutableList<Racer>> = MutableLiveData()
    val standings: LiveData<MutableList<Racer>> = mStandings


    fun getOvrMen() {
        mStandings.value = repository.getOvrMen()
    }

    fun getGsMen() {
        mStandings.value = repository.getGsMen()
    }

    fun getDhMen() {
        mStandings.value = repository.getDhMen()
    }

    fun getDhWomen() {
        mStandings.value = repository.getDhWomen()
    }

    fun getGsWomen() {
        mStandings.value = repository.getGsWomen()
    }

    fun getOvrWomen() {
        mStandings.value = repository.getOvrWomen()
    }
}