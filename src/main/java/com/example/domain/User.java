package com.example.domain;

public class User {
	
	private String userId;
	private String password;
	private String name;
	private String email;
	
	/**
	 * @param userId
	 * @param password
	 * @param name
	 * @param email
	 */
	public User()
	{
		
	}
	
	public User(String userId, String password, String name, String email) {
		super();
		this.userId = userId;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
