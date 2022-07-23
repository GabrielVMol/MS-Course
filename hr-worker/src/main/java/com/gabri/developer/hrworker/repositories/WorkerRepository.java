package com.gabri.developer.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gabri.developer.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}