package com.corsi.services;

import java.util.List;

import com.corsi.entities.Libretto;
import com.corsi.entities.Studente;

public interface ScuolaService {
	
	List<Studente> getStudenti();
	List<Libretto> getLibretti();
	
	Studente addStudente(Studente s);
	Libretto addLibretto(Libretto l);
	
	

}
