package com.example.springbootcircuitbreakerplayground

import io.github.resilience4j.circuitbreaker.CircuitBreakerConfig
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.time.Duration


@Configuration
class CircuitBreakerTestConfig {

    @Bean
    fun circuitBreakerConfig(): CircuitBreakerConfig = CircuitBreakerConfig.custom()
        .failureRateThreshold(50F) // open 상태로 전환될 임계. 100 개중 50개가 실패하면 OPEN
        .waitDurationInOpenState(Duration.ofMillis(1000)) // OPEN -> HALF_OPEN 전환시간
        .permittedNumberOfCallsInHalfOpenState(3) // HALF_OPEN 에서 요청이 3번 성공해야 CLOSE 로 변경
        .slidingWindowSize(10) // CLOSE 상태일 때 통계 수집을 위한 window size
//        .recordExceptions(IOException::class.java, TimeoutException::class.java)
//        .ignoreExceptions(BusinessException::class.java, OtherBusinessException::class.java)
        .build()
}