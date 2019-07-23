package com.authenticator.authenticate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.authenticator.authenticate.service.LoginService;
import com.authenticator.authenticate.wrapper.LoginRequest;
import com.authenticator.authenticate.wrapper.LoginResponse;

@RestController
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public LoginResponse login(@RequestBody LoginRequest loginRequest) {
		LoginResponse res = loginService.grantTokenIfValidate(loginRequest);
		return res;
	}
}
