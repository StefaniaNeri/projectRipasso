package com.viaggi.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Viaggio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_viaggio;
	
	private String destinazione, immagine;
	private double prezzo;
	
	@OneToMany(mappedBy = "viaggio", cascade = CascadeType.ALL)
	private Set<Prenotazione> prenotazioni = new HashSet<Prenotazione>();
	

}
