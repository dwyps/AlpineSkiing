package com.example.alpineskiing2020season.data.model

import java.net.URL

data class Event (
    val date: String,
    val flag: URL,
    val location: String,
    val discipline: String,
    val type: String,
    val women: Boolean,
    val men: Boolean
)