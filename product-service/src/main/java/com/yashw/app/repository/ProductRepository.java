package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	
	
}
