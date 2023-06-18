package com.example.springbootcircuitbreakerplayground

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CircuitBreakerTestController(
    private val circuitBreakerTestService: CircuitBreakerTestService,
) {

    @GetMapping("/hello")
    fun getHelloWorld(): String = circuitBreakerTestService.getHelloWorld()
}