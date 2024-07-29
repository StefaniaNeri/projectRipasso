package com.corsi;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.corsi.entities.Libretto;
import com.corsi.entities.Studente;
import com.corsi.services.ScuolaService;

@SpringBootTest
class PrjCorsi2ApplicationTests {

	@Autowired
	ScuolaService service;
	
	@Test
	void contextLoads() {
		
		Studente s = new Studente();
		s.setNome("pippo");
		Libretto l = new Libretto();
		l.setNumeroMatricola("123456");
		l.setStudente(s);
		
		service.addStudente(s);
		service.addLibretto(l);
		
		assertTrue(service.getStudenti().get(0).getNome().equals("pippo"));
	}

}
