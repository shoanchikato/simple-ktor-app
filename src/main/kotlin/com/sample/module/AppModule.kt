package com.sample.module

import com.sample.feature.myGson
import com.sample.feature.myLogger
import com.sample.routing.mainRouting
import io.ktor.application.Application
import io.ktor.application.install
import io.ktor.features.CallLogging
import io.ktor.features.ContentNegotiation
import io.ktor.routing.routing

fun Application.main() {
    install(ContentNegotiation) {
        myGson()
    }

    install(CallLogging) {
        myLogger()
    }

    routing {
        mainRouting()
    }
}



