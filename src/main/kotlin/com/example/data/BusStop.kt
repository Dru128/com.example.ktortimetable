package com.example.data

import kotlinx.serialization.Serializable

@Serializable
data class BusStop(
    var name: String?=null,
    var time: String?=null,
    var position: GeoPoint?=null
)