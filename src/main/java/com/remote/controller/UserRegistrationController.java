package com.remote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.remote.DTO.UserRegistrationDTO;
import com.remote.service.UserService;

@RestController
public class UserRegistrationController {

	@Autowired
	private UserService userService;

	@PostMapping("/signUp")
	public void registerUserAccount(@RequestBody UserRegistrationDTO registrationDto) {
		userService.save(registrationDto);
	}
	
}
