package com.example.springbootcircuitbreakerplayground

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker
import org.springframework.stereotype.Service

@Service
class CircuitBreakerTestService {

    @CircuitBreaker(name = "cat-image-circuit-breaker", fallbackMethod = "fallbackCatImage")
    fun catImage(id: Long): String {
        if (id < 10L) {
            return "$id cat's image.png"
        }
        throw RuntimeException("there is no cat's image for $id")
    }

    private fun fallbackCatImage(id: Long, t: Throwable): String {
        return "fallback cat image.png"
    }
}