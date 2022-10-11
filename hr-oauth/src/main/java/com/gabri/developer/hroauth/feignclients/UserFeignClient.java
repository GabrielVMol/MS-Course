package com.gabri.developer.hroauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gabri.developer.hroauth.entities.User;

@Component                                       // É usado para denotar a classe como um componente
@FeignClient(name = "hr-user", path ="/users")   // É usado para criar um cliente Spring Cloud LoadBalancer
public interface UserFeignClient {

	@GetMapping(value = "/search") // É uma anotação composta que funciona como um atalho para arquivos @RequestMapping
	ResponseEntity<User> findByEmail(@RequestParam String email);
}