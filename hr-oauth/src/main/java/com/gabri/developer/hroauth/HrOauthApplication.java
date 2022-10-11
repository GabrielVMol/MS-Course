package com.gabri.developer.hroauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients     // Habilita o OpenFeign que faz a interação entre as aplicações
@EnableEurekaClient     // Habilita a aplicação spring boot como um Client Eureka, usado para descobrir instâncias de serviço do Eureka Server
@SpringBootApplication  // Habilita os recursos do Spring Boot
public class HrOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOauthApplication.class, args);
	}

}