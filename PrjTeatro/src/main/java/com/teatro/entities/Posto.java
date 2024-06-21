package com.teatro.entities;

import jakarta.persistence.Entity;

@Entity
public class Posto {
	
	private int numero;
	private String fila;
	private Enum tipoPosto;

}
