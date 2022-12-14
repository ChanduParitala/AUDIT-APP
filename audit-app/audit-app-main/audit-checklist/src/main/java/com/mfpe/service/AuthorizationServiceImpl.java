package com.mfpe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfpe.feign.AuthorizationFeign;
import com.mfpe.model.AuthenticationResponse;

@Service
public class AuthorizationServiceImpl implements AuthorizationService {

	/**
	 * @param authClient
	 */
	public AuthorizationServiceImpl(AuthorizationFeign authClient) {
		super();
		this.authClient = authClient;
	}

	private AuthorizationFeign authClient;

	@Override
	public boolean validateJwt(String jwt) {
		AuthenticationResponse authenticationResponse = authClient.validate(jwt).getBody();
		return authenticationResponse.isValid();
	}

}
