package com.lemon;

import java.security.Principal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class LemonApplication {
	public static void main(String[] args) {
		SpringApplication.run(LemonApplication.class, args);
	}
	

}
