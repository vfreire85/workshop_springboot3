package com.victor_java.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor_java.teste.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
