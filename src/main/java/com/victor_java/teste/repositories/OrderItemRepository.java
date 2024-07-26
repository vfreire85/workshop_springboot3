package com.victor_java.teste.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.victor_java.teste.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
