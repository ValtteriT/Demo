package com.lemon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PermitController {
	@GetMapping("/")
	public String hello() {
		return "hello";
		
	}

}
