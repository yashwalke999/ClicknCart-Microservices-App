package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Cart;

public interface CartRepository extends JpaRepository<Cart, Integer> {
	
	
	
}
