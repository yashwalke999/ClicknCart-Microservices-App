package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {
	
	
	
}
