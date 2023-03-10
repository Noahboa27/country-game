package com.example.geogame.core.domain.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Eng(
    @Json(name = "f")
    val f: String = "",
    @Json(name = "m")
    val m: String = ""
)