package com.gabri.developer.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker  // Habilita a aplicação ao uso do Circuit Breaker para lidar com as falhas
@EnableEurekaClient    // Habilita a aplicação as instâncias de serviço do Eureka Server
@EnableFeignClients    // Habilita o OpenFeign que faz a interação entre as aplicações
@SpringBootApplication // Habilita os recursos do Spring Boot
public class HrPayrollApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrPayrollApplication.class, args);
	}
}