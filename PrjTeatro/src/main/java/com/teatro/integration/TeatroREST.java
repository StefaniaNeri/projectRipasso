package com.teatro.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.teatro.entities.Prenotazione;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;
import com.teatro.services.TeatroService;


@RestController
@RequestMapping("api")
public class TeatroREST {
	
	@Autowired
	private TeatroService tService;
	
	@GetMapping("spettacoli")
	public List<Spettacolo> getSpettacoli(){
		return tService.getSpettacoli();
	}
	
	@PostMapping("spettacoli")
	public Spettacolo addSpettacoli(@RequestBody Spettacolo s){
		return tService.addSpettacolo(s);
	}
	
	@GetMapping("spettacoli/{id}")
	public Spettacolo getSpettacoloById(@PathVariable int id){
		return tService.getSpettacoloById(id);
	}
	
	@GetMapping("repliche")
	public List<Replica> getRepliche(){
		return tService.getRepliche();
	}
	
	@GetMapping("prenotazioni")
	public List<Prenotazione> getPrenotazioni(){
		return tService.getPrenotazioni();
	}
	
	@PostMapping("prenotazioni")
	public Prenotazione addPrenotazioni(@RequestBody Prenotazione p){
		return tService.addPrenotazione(p);
	}

}
