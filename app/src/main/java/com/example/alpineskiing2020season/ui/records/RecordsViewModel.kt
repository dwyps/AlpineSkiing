package com.example.alpineskiing2020season.ui.records

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.alpineskiing2020season.data.model.Record
import com.example.alpineskiing2020season.data.repository.Repository

class RecordsViewModel (
    private val repository: Repository
) : ViewModel() {

    private val mRecords: MutableLiveData<MutableList<Record>> = MutableLiveData()
    val records: LiveData<MutableList<Record>> = mRecords

    fun getRecords() {
        mRecords.value = repository.getRecords()
    }

}