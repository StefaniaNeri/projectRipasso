package com.corsi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.corsi.entities.Studente;
import com.corsi.services.ScuolaService;

@RestController
@RequestMapping("api")
public class ScuolaREST {

	@Autowired
	private ScuolaService service;
	
	@GetMapping("studenti")
	public ResponseEntity<List<Studente>> getStudenti(){
		
		return new ResponseEntity<>(service.getStudenti(), HttpStatus.OK);
	}
	
	@PostMapping("studenti")
	public ResponseEntity<Studente> addStudenti(@RequestBody Studente s){
		Studente studente = service.addStudente(s);
		
		
		service.addLibretto(s.getLibretto());
		return new ResponseEntity<>(studente, HttpStatus.CREATED);
	}
}


