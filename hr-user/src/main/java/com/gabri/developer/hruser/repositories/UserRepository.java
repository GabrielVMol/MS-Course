package com.gabri.developer.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabri.developer.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByEmail(String email);
}