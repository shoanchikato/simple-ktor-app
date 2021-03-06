/*
 * This Kotlin source file was generated by the Gradle 'init' task.
 */
package com.sample

import com.sample.module.main
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlin.test.Test
import kotlin.test.assertEquals

class AppTest {
    @Test
    fun testRequests() = withTestApplication(Application::main) {
        with(handleRequest(HttpMethod.Get, "/")) {
            assertEquals(HttpStatusCode.OK, response.status())
            assertEquals("hello world", response.content)
        }
//        with(handleRequest(HttpMethod.Get, "/index.html")) {
//            assertFalse(requestHandled)
//        }
    }
}
