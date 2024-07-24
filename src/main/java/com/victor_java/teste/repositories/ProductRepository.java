package com.victor_java.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor_java.teste.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
