package com.gabri.developer.hrworker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient    // Habilita a aplicação as instâncias de serviço do Eureka Server 
@SpringBootApplication // Habilita os recursos do Spring Boot
public class HrWorkerApplication { 

	public static void main(String[] args) {
		SpringApplication.run(HrWorkerApplication.class, args); 
	}
}