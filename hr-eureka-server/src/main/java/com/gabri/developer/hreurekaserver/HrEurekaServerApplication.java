package com.gabri.developer.hreurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer     // Habilita a aplicação spring boot como um Servidor Eureka que recebera requisições de aplicações Cliente Eureka
@SpringBootApplication  // Habilita os recursos do Spring Boot
public class HrEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrEurekaServerApplication.class, args);
	}

}