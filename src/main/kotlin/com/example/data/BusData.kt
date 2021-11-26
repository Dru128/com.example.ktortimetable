package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class BusData(
    var name: String?=null,
    val route: MutableList<GeoPoint>?=null,
    val busStops: MutableList<BusStop>?=null,
)