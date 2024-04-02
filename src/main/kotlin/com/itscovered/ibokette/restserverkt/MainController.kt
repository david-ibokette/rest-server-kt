package com.itscovered.ibokette.restserverkt

import org.springframework.web.bind.annotation.*
import java.time.LocalDateTime

@RestController
class MainController {

    @GetMapping("/")
    fun getData(): WebhookEntity {
        return WebhookEntity("111", "2222", "3333")
    }

    @PostMapping("/")
    fun postData(@RequestBody payload: WebhookEntity,
                 @RequestHeader headers: Map<String, String>) {
        println("""${LocalDateTime.now()}: Got webhook: $payload""")
        println("""${LocalDateTime.now()}: Got headers: $headers""")
    }
}