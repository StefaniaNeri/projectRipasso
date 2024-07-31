package com.teatro.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Spettacoli")
public class Spettacolo {

	@Id
	@Column(name = "cod_spettacolo", length = 4)
	private String cod_spettacolo;
	
	@Column(name = "titolo", length = 40)
	private String titolo;
	
	@Column(name = "autore", length = 25)
	private String autore;
	
	@Column(name = "regista", length = 25)
	private String regista;
	
	@Column(name = "prezzo", precision = 6, scale = 2)
	private int prezzo;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name= "cod_teatro")
	private Teatro cod_teatro;
	


	public String getCod_spettacolo() {
		return cod_spettacolo;
	}
	public void setCod_spettacolo(String cod_spettacolo) {
		this.cod_spettacolo = cod_spettacolo;
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	

	public Teatro getCod_teatro() {
		return cod_teatro;
	}
	public void setCod_teatro(Teatro cod_teatro) {
		this.cod_teatro = cod_teatro;
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	public String getRegista() {
		return regista;
	}
	public void setRegista(String regista) {
		this.regista = regista;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}

	
	
	
}
