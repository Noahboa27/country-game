package com.example.geogame.core.data.network.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Deu(
    @Json(name = "common")
    val common: String = "",
    @Json(name = "official")
    val official: String = ""
)