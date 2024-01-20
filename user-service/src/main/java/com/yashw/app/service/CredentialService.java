package com.yashw.app.service;

import java.util.List;

import com.yashw.app.dto.CredentialDto;

public interface CredentialService {
	
	List<CredentialDto> findAll();
	CredentialDto findById(final Integer credentialId);
	CredentialDto save(final CredentialDto credentialDto);
	CredentialDto update(final CredentialDto credentialDto);
	CredentialDto update(final Integer credentialId, final CredentialDto credentialDto);
	void deleteById(final Integer credentialId);
	CredentialDto findByUsername(final String username);
	
}










