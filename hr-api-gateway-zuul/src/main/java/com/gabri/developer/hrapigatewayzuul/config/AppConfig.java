package com.gabri.developer.hrapigatewayzuul.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@RefreshScope   // Usada para carregar o valor das propreidades do servidor de Configurações 
@Configuration  // Indica que a classe possui métodos de definição @Bean
public class AppConfig {  // Aplicação de configuração do Token

	@Value("${jwt.secret}")  // É usada para atribuir valores padrão a variáveis e argumentos de métodos
	private String jwtSecret;;
	
	@Bean // Indica que o método anotado produz um bean a ser gerenciado pelo contêiner spring
	public JwtAccessTokenConverter accessTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey(jwtSecret);
		return tokenConverter;
	}
	
	@Bean
	public JwtTokenStore tokenStore() {
		return new JwtTokenStore(accessTokenConverter());
	}
}