package com.example.springbootcircuitbreakerplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CircuitBreakerTestApplication

fun main(args: Array<String>) {
	runApplication<CircuitBreakerTestApplication>(*args)
}
