package com.itscovered.ibokette.restserverkt

import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
class MainController {

    @GetMapping("/")
    fun getData(): Map<String, String> {
        return mapOf("eventType" to "111", "uuid" to "2222", "objectType" to "3333")
    }

    @PostMapping("/")
    fun postMapData(@RequestBody payload: Map<String, String>,
                    @RequestHeader headers: Map<String, String>) {
        println("""${LocalDateTime.now()}: Got webhook: $payload""")
        println("""${LocalDateTime.now()}: Got headers: $headers""")
    }
}