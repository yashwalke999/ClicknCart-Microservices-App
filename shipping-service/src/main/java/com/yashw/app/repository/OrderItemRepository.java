package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.OrderItem;
import com.yashw.app.domain.id.OrderItemId;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemId> {
	
	
	
}
