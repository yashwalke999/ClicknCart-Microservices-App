package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
	
	
}
