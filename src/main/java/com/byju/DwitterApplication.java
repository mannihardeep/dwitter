package com.byju;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.byju")
public class DwitterApplication {
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DwitterApplication.class, args);
	}

}
