package com.yashw.app.service;

import java.util.List;

import com.yashw.app.domain.id.FavouriteId;
import com.yashw.app.dto.FavouriteDto;

public interface FavouriteService {
	
	List<FavouriteDto> findAll();
	FavouriteDto findById(final FavouriteId favouriteId);
	FavouriteDto save(final FavouriteDto favouriteDto);
	FavouriteDto update(final FavouriteDto favouriteDto);
	void deleteById(final FavouriteId favouriteId);
	
}
