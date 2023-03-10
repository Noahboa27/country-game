package com.example.geogame.core.domain.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Hrv(
    @Json(name = "common")
    val common: String = "",
    @Json(name = "official")
    val official: String = ""
)