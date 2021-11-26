package com.example.data
import kotlinx.serialization.Serializable


@Serializable
class GeoPoint(var latitude: Double, var longitude: Double)
{
    fun GeoPoint(latitude: Double, longitude: Double)
    {
        require(!(java.lang.Double.isNaN(latitude) || latitude < -90 || latitude > 90)) { "Latitude must be in the range of [-90, 90]" }
        require(!(java.lang.Double.isNaN(longitude) || longitude < -180 || longitude > 180)) { "Longitude must be in the range of [-180, 180]" }
        this.latitude = latitude
        this.longitude = longitude
    }
}