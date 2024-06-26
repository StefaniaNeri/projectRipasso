package com.teatro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Biglietto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double costoBiglietto;
	
	@OneToOne
	private Posto posto;
	
	@ManyToOne
	@JoinColumn(name="id_prenotazione")
	private Prenotazione prenotazione;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCostoBiglietto() {
		return costoBiglietto;
	}

	public void setCostoBiglietto(double costoBiglietto) {
		this.costoBiglietto = costoBiglietto;
	}
	
	

}
