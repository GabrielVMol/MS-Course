package com.gabri.developer.hrpayroll.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gabri.developer.hrpayroll.entities.Worker;

@Component                                           // É usado para denotar a classe como um componente
@FeignClient(name = "hr-worker", path = "/workers")  // É usado para criar um cliente Spring Cloud LoadBalancer
public interface WorkerFeignClient {

	@GetMapping(value = "/{id}") // É uma anotação composta que funciona como um atalho para arquivos @RequestMapping
	ResponseEntity<Worker> findById(@PathVariable Long id);
}