package com.gabri.developer.hruser.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gabri.developer.hruser.entities.User;
import com.gabri.developer.hruser.repositories.UserRepository;

@RestController                    // Permite lidar com todas as APIs REST, com solicitações GET, POST, PUT, DELETE
@RequestMapping(value = "/users")  // É usado para  mapear solicitações HTTP para métodos manipuladores de controladores MVC e REST
public class UserResource {
	
	@Autowired  // Indica onde a injeção automática deve ser aplicada
	private UserRepository repository;
	
	@GetMapping(value = "/{id}")  // É uma anotação composta que funciona como um atalho para arquivos @RequestMapping
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}	
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email) {
		User obj = repository.findByEmail(email);
		return ResponseEntity.ok(obj);
	}
}