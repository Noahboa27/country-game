package com.example.geogame.core.domain.model


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PostalCode(
    @Json(name = "format")
    val format: String = "",
    @Json(name = "regex")
    val regex: String = ""
)