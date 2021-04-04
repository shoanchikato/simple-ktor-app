package com.sample.feature

import io.ktor.features.CallLogging
import org.slf4j.event.Level

fun CallLogging.Configuration.myLogger() {
    level = Level.INFO
}
