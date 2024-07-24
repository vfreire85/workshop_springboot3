package com.victor_java.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor_java.teste.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
