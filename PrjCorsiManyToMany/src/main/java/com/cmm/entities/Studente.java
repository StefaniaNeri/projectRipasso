package com.cmm.entities;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Studente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_studente;
	
	private String nome;
	
	@ManyToMany
	@JoinTable(
			  name = "iscrizioni", 
			  joinColumns = @JoinColumn(name = "id_studente"), 
			  inverseJoinColumns = @JoinColumn(name = "id_corso"))
	private Set<Corso> corsi;



	public int getId_studente() {
		return id_studente;
	}

	public void setId_studente(int id_studente) {
		this.id_studente = id_studente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Set<Corso> getCorsi() {
		return corsi;
	}

	public void setCorsi(Set<Corso> corsi) {
		this.corsi = corsi;
	}

}
