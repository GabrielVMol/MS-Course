package com.gabri.developer.hrapigatewayzuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableEurekaClient     // Habilita a aplicação as instâncias de serviço do Eureka Server
@EnableZuulProxy        // Habilita a aplicação ao zuul que vai servir como gateway das APIs
@SpringBootApplication  // Habilita os recursos do Spring Boot
public class HrApiGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrApiGatewayZuulApplication.class, args);
	}

}