package com.teatro.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeatroMvc {
	
	@GetMapping("index")
	public String home() {
		return "index";
	}
	
	@GetMapping("carrello")
	public String carrello() {
		return "carrello";
	}

}
