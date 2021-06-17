package com.remote.service;

import java.util.Arrays; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.remote.DTO.UserRegistrationDTO;
import com.remote.Repository.UserRepository;
import com.remote.model.Role;
import com.remote.model.UserModel;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
//	@Autowired
//	private BCryptPasswordEncoder passwordEncoder;
	
	@Override
	public UserModel save(UserRegistrationDTO registrationDto) {
		
		UserModel user = new UserModel(registrationDto.getRegNo(), registrationDto.getEmail(),
				registrationDto.getPassword(), Arrays.asList(new Role("ROLE_USER")));
		
		return userRepository.save(user);
	}

	
}
