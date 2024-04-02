package com.itscovered.ibokette.restserverkt

import org.springframework.web.bind.annotation.*

@RestController
class MainController {

    @GetMapping("/")
    fun getData(): WebhookEntity {
        return WebhookEntity("111", "2222", "3333")
    }

    @PostMapping("/")
    fun postData(@RequestBody payload: WebhookEntity,
                 @RequestHeader headers: Map<String, String>) {
        println("Got webhook: $payload")
        println("Got headers: $headers")
    }
}