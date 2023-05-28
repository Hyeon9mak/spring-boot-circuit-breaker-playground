package com.example.springbootcircuitbreakerplayground

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootCircuitBreakerPlaygroundApplication

fun main(args: Array<String>) {
	runApplication<SpringBootCircuitBreakerPlaygroundApplication>(*args)
}
