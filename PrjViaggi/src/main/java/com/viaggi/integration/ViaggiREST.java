package com.viaggi.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.viaggi.entities.Prenotazione;
import com.viaggi.entities.Utente;
import com.viaggi.entities.Viaggio;
import com.viaggi.services.ViaggiServiceImpl;

@RestController
@RequestMapping("api")
public class ViaggiREST {
	
	@Autowired
	private ViaggiServiceImpl vServ;
	
	
	@GetMapping("utenti")
	public List<Utente> getUtenti() {
		return vServ.getUtenti();
	}
	
	
	@GetMapping("viaggi")
	public List<Viaggio> getViaggi() {
		return vServ.getViaggi();
	}
	
	@GetMapping("prenotazioni")
	public List<Prenotazione> getPrenotazione() {
		return vServ.getPrenotazioni();
	}
	
	@PostMapping("utenti")
	public Utente addUtente(@RequestBody Utente u) {
		return vServ.addUtente(u);
	}
	
	@PostMapping("viaggi")
	public Viaggio addViaggio(@RequestBody Viaggio v) {
		return vServ.addViaggio(v);
	}
}
