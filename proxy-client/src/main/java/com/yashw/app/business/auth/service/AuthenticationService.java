package com.yashw.app.business.auth.service;

import com.yashw.app.business.auth.model.request.AuthenticationRequest;
import com.yashw.app.business.auth.model.response.AuthenticationResponse;

public interface AuthenticationService {
	
	AuthenticationResponse authenticate(final AuthenticationRequest authenticationRequest);
	Boolean authenticate(final String jwt);
	
}
