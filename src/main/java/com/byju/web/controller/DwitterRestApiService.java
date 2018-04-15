package com.byju.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.byju.dto.RegisterDTO;
import com.byju.web.service.LoginService;

@RestController
public class DwitterRestApiService {
	
	@Autowired
	LoginService service;
	
	public Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/register", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE )
	public void register(@RequestBody RegisterDTO registerDTO) {
		log.info("TESTING REGISTER");
		service.register(registerDTO);
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public void test() {
		log.info("TESTING 123");
	}

}
