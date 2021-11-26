package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.application.*
import io.ktor.application.*
import io.ktor.features.*
import io.ktor.serialization.*


fun main()
{
    embeddedServer(Netty, port = 8080, host = "127.0.0.1")
    {
        println("main")
        registerCustomerRoutes()
        configureRouting()
        install(ContentNegotiation) {
            json()
        }
    }.start(wait = true)

}

fun Application.module()
{

    registerCustomerRoutes()
}