package com.gabri.developer.hruser.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration  // Indica que a classe possui métodos de definição @Bean
public class AppConfig {

	@Bean  // Indica que o método anotado produz um bean a ser gerenciado pelo contêiner spring
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
}