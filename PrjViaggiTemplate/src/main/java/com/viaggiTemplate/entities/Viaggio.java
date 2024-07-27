package com.viaggiTemplate.entities;

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
	
	private String destinazione;
	private double prezzo;
	
	@OneToMany(mappedBy = "viaggio", cascade = CascadeType.ALL)
	private Set<Prenotazione> prenotazioni = new HashSet<Prenotazione>();

	public int getId_viaggio() {
		return id_viaggio;
	}

	public void setId_viaggio(int id_viaggio) {
		this.id_viaggio = id_viaggio;
	}

	public String getDestinazione() {
		return destinazione;
	}

	public void setDestinazione(String destinazione) {
		this.destinazione = destinazione;
	}

	public double getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}

	public Set<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(Set<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	
	

}
