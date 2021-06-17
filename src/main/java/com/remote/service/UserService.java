package com.remote.service;

import com.remote.DTO.UserRegistrationDTO;
import com.remote.model.UserModel;

public interface UserService {
	UserModel save(UserRegistrationDTO registrationDto);
}
