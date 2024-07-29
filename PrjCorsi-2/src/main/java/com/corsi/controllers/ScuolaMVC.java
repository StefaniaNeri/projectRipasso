package com.corsi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import com.corsi.services.ScuolaService;

public class ScuolaMVC {
	
	@Autowired
	private ScuolaService service;
	
	@GetMapping("studenti")
	public String studenti() {
		return "studenti";
	}

}
