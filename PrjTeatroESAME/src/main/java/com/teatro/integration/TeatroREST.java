package com.teatro.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatro.entities.Biglietto;
import com.teatro.entities.Cliente;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;
import com.teatro.entities.Teatro;
import com.teatro.services.TeatroService;


@RestController
@RequestMapping("api")
public class TeatroREST {
	
	@Autowired
	private TeatroService tService;
	
	@GetMapping("biglietti")
	public ResponseEntity<List<Biglietto>> getBiglietti() {
		return new ResponseEntity<>(tService.getBiglietti(), HttpStatus.OK);
	}
	
	@GetMapping("spettacoli")
	public ResponseEntity<List<Spettacolo>> getSpettacoli() {
		return new ResponseEntity<>(tService.getSpettacoli(), HttpStatus.OK);
	}
	
	@GetMapping("teatri")
	public ResponseEntity<List<Teatro>> getTeatri() {
		return new ResponseEntity<>(tService.getTeatri(), HttpStatus.OK);
	}
	
	@PatchMapping("teatri")
	public ResponseEntity<Teatro> updTeatro(@RequestBody Teatro t) {
		return new ResponseEntity<>(tService.updTeatro(t), HttpStatus.OK);
	}
	
	@GetMapping("clienti")
	public ResponseEntity<List<Cliente>> getClienti() {
		return new ResponseEntity<>(tService.getClienti(), HttpStatus.OK);
	}
	
	@PostMapping("spettacoli")
	public ResponseEntity<Spettacolo> addSpettacolo(@RequestBody Spettacolo s) {
		return new ResponseEntity<>(tService.addSpettacolo(s), HttpStatus.CREATED);
	}
	
	@PostMapping("biglietti")
	public ResponseEntity<Biglietto> addBiglietto(@RequestBody Biglietto b) {
		return new ResponseEntity<>(tService.addBiglietto(b), HttpStatus.CREATED);
	}

	
	@GetMapping("repliche")
	public ResponseEntity<List<Replica>> getRepliche() {
		return new ResponseEntity<>(tService.getRepliche(), HttpStatus.OK);
	}
	
	
}
