package com.sample.routing

import com.sample.model.Person
import io.ktor.application.call
import io.ktor.response.respond
import io.ktor.response.respondText
import io.ktor.routing.Routing
import io.ktor.routing.get

fun Routing.mainRouting() {
    get("/") {
        call.respondText("hello world")
    }

    get("/person") {
        call.respond(Person("John", 23))
    }
}