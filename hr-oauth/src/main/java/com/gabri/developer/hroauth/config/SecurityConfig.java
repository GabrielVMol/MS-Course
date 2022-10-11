package com.gabri.developer.hroauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration // Indica que a classe possui métodos de definição Bean
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired // Indica um ponto aonde a injeção automática deve ser aplicada 
	private BCryptPasswordEncoder passwordEncoder;
	
	@Autowired
	private UserDetailsService userDetailsService;

	@Override
	@Autowired
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
	}

	@Override // Reescrever um método que foi herdado
	@Bean     // Indica que o método anotado produz um bean a ser gerenciado pelo contêiner spring
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}
}