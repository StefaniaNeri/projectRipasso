package com.teatro.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Teatri")
public class Teatro {
	
	@Id
	@Column(name = "cod_teatro", length = 4)
	private String cod_teatro;
	
	@Column(name = "nome", length = 30)
	private String nome;
	
	@Column(name = "indirizzo", length = 30)
	private String indirizzo;
	
	@Column(name = "citta", length = 25)
	private String citta;
	
	@Column(name = "provincia", length = 2)
	private String provincia;
	
	@Column(name = "telefono", length = 14)
	private String telefono;
	
	private int posti;


	public String getCod_teatro() {
		return cod_teatro;
	}

	public void setCod_teatro(String cod_teatro) {
		this.cod_teatro = cod_teatro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}


	
	

}
