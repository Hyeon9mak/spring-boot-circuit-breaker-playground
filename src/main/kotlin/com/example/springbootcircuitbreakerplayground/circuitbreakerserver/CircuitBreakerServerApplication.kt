package com.example.springbootcircuitbreakerplayground.circuitbreakerserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CircuitBreakerServerApplication

fun main(args: Array<String>) {
	runApplication<CircuitBreakerServerApplication>(*args)
}
