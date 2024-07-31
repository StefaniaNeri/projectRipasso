package com.teatro.presentation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TeatroMvc {
	
	@GetMapping("index")
	public String login() {
		return "index";
	}
	
	@GetMapping("home")
	public String home() {
		return "home";
	}
	
	@GetMapping("carrello")
	public String carrello() {
		return "carrello";
	}
	
	@GetMapping("prenotazioni")
	public String prenotazioni() {
		return "prenotazioni";
	}
	
}
