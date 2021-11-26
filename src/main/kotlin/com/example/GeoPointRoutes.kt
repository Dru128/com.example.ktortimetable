package com.example

import com.example.data.GeoPoint
import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*


fun Route.geoPointRouting()
{
    route("/geopoint") {
        get {
            call.respond(GeoPoint(5.0, 30.0))
        }
        get("{id}") {
            call.respond(GeoPoint(5.0, 30.0))

        }
        post {
            call.respond(GeoPoint(5.0, 30.0))

        }
        delete("{id}") {
            call.respond(GeoPoint(5.0, 30.0))
        }
    }
}

fun Application.registerCustomerRoutes() {
    routing {
        geoPointRouting()
    }
}