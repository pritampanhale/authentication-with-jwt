package com.authenticator.authenticate.service;

import com.authenticator.authenticate.wrapper.LoginRequest;
import com.authenticator.authenticate.wrapper.LoginResponse;

public interface LoginService {

	Boolean validateUser(LoginRequest loginRequest);
	
	LoginResponse grantTokenIfValidate(LoginRequest loginRequest);
}
