package com.authenticator.authenticate.wrapper;

import java.time.LocalDateTime;

public class LoginResponse {

	private Boolean success;
	private String response;
	private String token;
	private LocalDateTime tokenValidTill;
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public LocalDateTime getTokenValidTill() {
		return tokenValidTill;
	}
	public void setTokenValidTill(LocalDateTime tokenValidTill) {
		this.tokenValidTill = tokenValidTill;
	}
	
	
}
