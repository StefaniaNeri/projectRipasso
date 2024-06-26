package com.teatro.entities;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
    private String nomeCliente;
    private Date dataPrenotazione;
    private Replica replica;
    private List<Biglietto> biglietti;

}
