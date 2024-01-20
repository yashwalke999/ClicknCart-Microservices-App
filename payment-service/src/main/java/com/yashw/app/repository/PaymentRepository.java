package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer> {
	
	
	
}
