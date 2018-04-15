package com.byju.web.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.byju.dto.RegisterDTO;

@RestController
public class DwitterRestApiService {
	
	public Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/register")
	public void register(@RequestBody RegisterDTO registerDTO) {
		
	}

}
