package com.teatro.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Biglietto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double costoBiglietto;

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
