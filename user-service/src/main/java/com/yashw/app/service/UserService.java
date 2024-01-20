package com.yashw.app.service;

import java.util.List;

import com.yashw.app.dto.UserDto;

public interface UserService {
	
	List<UserDto> findAll();
	UserDto findById(final Integer userId);
	UserDto save(final UserDto userDto);
	UserDto update(final UserDto userDto);
	UserDto update(final Integer userId, final UserDto userDto);
	void deleteById(final Integer userId);
	UserDto findByUsername(final String username);
	
}










