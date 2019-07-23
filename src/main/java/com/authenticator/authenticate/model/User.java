package com.authenticator.authenticate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {

	public User() {
		// TODO Auto-generated constructor stub
	}

	@Column(name = "user_id")
	@Id
	@GeneratedValue
	private Integer userId;
	
	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "password")
	private String password;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
