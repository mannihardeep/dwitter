package com.byju.web.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.byju.dao.entity.UserProfile;
import com.byju.dao.repository.UserProfileRepo;
import com.byju.dto.RegisterDTO;
import com.byju.web.service.LoginService;

@Component
public class LoginServiceImpl implements LoginService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Autowired
	UserProfileRepo userRepo;
	
	@Override
	public void doLogin() {
		
	}
	
	@Override
	public void register(RegisterDTO dto) {
		UserProfile profile = new UserProfile();
		log.info(dto.toString());
		profile.setEmail(dto.getEmail());
		profile.setFirstName(dto.getFirstName());
		profile.setLastName(dto.getLastName());
		profile.setPhoneNumber(dto.getPhoneNumber());
		profile.setUsername(dto.getUsername());
		profile.setPassword(dto.getPassword());
		log.info(profile.toString());
		userRepo.saveAndFlush(profile);
		
	}

}
