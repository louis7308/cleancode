package com.example.cleancode.global.health.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthCheckController {

    @GetMapping("/api/ping")
    fun ping(): String { // MSA 방식일때 HealthCheck 용으로 Ping Api를 만들어서 서버가 켜져있는지 확인용도로 사용
        return "ok"
    }
}