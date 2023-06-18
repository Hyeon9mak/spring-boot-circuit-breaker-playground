package com.example.springbootcircuitbreakerplayground

import io.github.resilience4j.retry.annotation.Retry
import org.springframework.stereotype.Service

@Service
class CircuitBreakerTestService {

    private var count = 0

    @Retry(
        name = "getHelloWorld",
        fallbackMethod = "getHelloUniverse",
    )
    fun getHelloWorld(): String {
        count += 1

        if (count in 6..10) {
            throw Exception("Error")
        }

        return "Hello World"
    }

    fun getHelloUniverse(): String {
        return "Hello Universe"
    }
}
