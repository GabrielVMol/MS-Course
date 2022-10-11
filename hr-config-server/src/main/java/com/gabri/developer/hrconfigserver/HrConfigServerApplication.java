package com.gabri.developer.hrconfigserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer      // Habilita a aplicação Spring Boot como um Servidor de Configuração
@SpringBootApplication   // Habilita os recursos do Spring Boot
public class HrConfigServerApplication implements CommandLineRunner {

	@Value("${spring.cloud.config.server.git.username}") // É usada para atribuir valores padrão a variáveis e argumentos de métodos
	private String username;

	public static void main(String[] args) {
		SpringApplication.run(HrConfigServerApplication.class, args);
	}

	@Override // Reescrever um método que foi herdado
	public void run(String... args) throws Exception {
		//System.out.println("USERNAME = " + username);
	}
}