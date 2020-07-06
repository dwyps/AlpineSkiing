package com.example.alpineskiing2020season.util

import com.example.alpineskiing2020season.data.repository.Repository

object InjectorUtils {

    private fun getRepository(): Repository {
        return Repository.getInstance()
    }

    fun provideViewModelFactory(): ViewModelFactory {
        return ViewModelFactory(getRepository())
    }

}