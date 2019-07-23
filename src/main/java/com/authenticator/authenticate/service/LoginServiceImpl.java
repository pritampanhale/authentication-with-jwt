package com.authenticator.authenticate.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.authenticator.authenticate.components.JwtTokenUtil;
import com.authenticator.authenticate.dao.UserRepository;
import com.authenticator.authenticate.model.User;
import com.authenticator.authenticate.wrapper.LoginRequest;
import com.authenticator.authenticate.wrapper.LoginResponse;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.impl.DefaultJwtBuilder;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepository userDoa;
	
	@Autowired
	private JwtTokenUtil jwtTokenUtil;
	
	@Override
	public Boolean validateUser(LoginRequest loginRequest) {
		// TODO Auto-generated method stub
		List<User> findAll = userDoa.findAll();
		boolean anyMatch = findAll.stream().anyMatch(user->user.getPassword().equals(loginRequest.getPassword()) &&
				user.getUserName().equals(loginRequest.getUserName()));
		return anyMatch;
	}

	@Override
	public LoginResponse grantTokenIfValidate(LoginRequest loginRequest) {
		LoginResponse response = new LoginResponse();
		response.setSuccess(Boolean.FALSE);
		response.setResponse("Wrong Credentials");
		response.setToken("invalidToken");
		response.setTokenValidTill(LocalDateTime.now());
		
		if(validateUser(loginRequest)) {
			response.setSuccess(Boolean.TRUE);
			response.setResponse("Login successfull");
			response.setTokenValidTill(LocalDateTime.now());
			String generatedToken = jwtTokenUtil.generateToken(loginRequest);
			response.setToken(generatedToken);
		}
		
		return response;
		
	}

}
