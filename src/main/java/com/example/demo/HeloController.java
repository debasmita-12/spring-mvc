package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HeloController {
	
	
	@GetMapping("/world")
	@ResponseBody
	
	public String HeloSpring() {
		return "hello";
		
	}

}
