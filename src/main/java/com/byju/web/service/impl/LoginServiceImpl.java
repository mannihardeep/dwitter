package com.byju.web.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.byju.dao.entity.UserProfile;
import com.byju.dao.repository.UserProfileRepo;
import com.byju.dto.RegisterDTO;
import com.byju.web.service.LoginService;

public class LoginServiceImpl implements LoginService {
	
	@Autowired
	UserProfileRepo userRepo;
	
	@Override
	public void doLogin() {
		
	}
	
	@Override
	public void register(RegisterDTO dto) {
		UserProfile profile = new UserProfile();
		profile.setEmail(dto.getEmail());
		profile.setFirstName(dto.getFirstName());
		profile.setLastName(dto.getLastName());
		profile.setPhoneNumber(dto.getPhoneNumber());
		profile.setUsername(dto.getUsername());
		profile.setPassword(dto.getPassword());
		userRepo.saveAndFlush(profile);
		
	}

}
