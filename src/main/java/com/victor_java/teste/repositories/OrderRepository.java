package com.victor_java.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor_java.teste.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
