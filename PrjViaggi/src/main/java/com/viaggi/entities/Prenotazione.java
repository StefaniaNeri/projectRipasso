package com.viaggi.entities;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private Date dataPrenotazione;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "id_viaggio")
	private Viaggio viaggio;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name= "id_utente")
	private Utente utente;

}
