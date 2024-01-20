package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {
	
	
	
}
