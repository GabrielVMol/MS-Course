package com.gabri.developer.hruser;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient     // Habilita a aplicação as instâncias de serviço do Eureka Server
@SpringBootApplication  // Habilita os recursos do Spring Boot
public class HrUserApplication implements CommandLineRunner{

	//@Autowired // Indica um ponto aonde a injeção automática deve ser aplicada
	//private BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(HrUserApplication.class, args);
	}

	@Override  // Reescrever um método que foi herdado
	public void run(String... args) throws Exception {
		//System.out.println("BCRYPT = " + passwordEncoder.encode("123456"));	
	}
}