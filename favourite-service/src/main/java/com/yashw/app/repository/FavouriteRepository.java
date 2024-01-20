package com.yashw.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yashw.app.domain.Favourite;
import com.yashw.app.domain.id.FavouriteId;

public interface FavouriteRepository extends JpaRepository<Favourite, FavouriteId> {
	
	
	
}
