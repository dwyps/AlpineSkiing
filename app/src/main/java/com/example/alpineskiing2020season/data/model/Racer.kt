package com.example.alpineskiing2020season.data.model

import java.net.URL

data class Racer(
    val country: Country,
    val id: String,
    val image: URL,
    val lastName: String,
    val name: String,
    val place: String,
    val points: Int
)