package com.gabri.developer.hrpayroll.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration // Indica que a classe possui métodos de definição @Bean
public class AppConfig {

	@Bean // Indica que o método anotado produz um bean a ser gerenciado pelo contêiner spring
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}