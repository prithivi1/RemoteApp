package com.remote.DTO;

public class UserRegistrationDTO {
	
	private String email;
	private String regNo;
	private String password;
	
	public UserRegistrationDTO()
	{
	}

	public UserRegistrationDTO(String email, String regNo, String password) {
		super();
		this.email = email;
		this.regNo = regNo;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
