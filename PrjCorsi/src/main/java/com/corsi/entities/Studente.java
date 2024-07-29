package com.corsi.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="studenti")
public class Studente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
//	se cancelli uno studente vuoi che si cancelli un suo libretto, quindi cascade all
	@OneToOne(mappedBy = "studente", cascade = CascadeType.ALL)
	private Libretto libretto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Libretto getLibretto() {
		return libretto;
	}

	public void setLibretto(Libretto libretto) {
		this.libretto = libretto;
	}
	
	
}
