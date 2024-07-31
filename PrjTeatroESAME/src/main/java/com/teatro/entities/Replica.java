package com.teatro.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Repliche")
public class Replica {
	
	
	@Id
	@Column(name = "cod_replica", length = 4)
	private String cod_replica;
	
	private LocalDate data_replica;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name= "cod_spettacolo")
    private Spettacolo cod_spettacolo;


	public LocalDate getData_replica() {
		return data_replica;
	}

	public void setData_replica(LocalDate data_replica) {
		this.data_replica = data_replica;
	}

	public String getCod_replica() {
		return cod_replica;
	}

	public void setCod_replica(String cod_replica) {
		this.cod_replica = cod_replica;
	}

	public Spettacolo getCod_spettacolo() {
		return cod_spettacolo;
	}

	public void setCod_spettacolo(Spettacolo cod_spettacolo) {
		this.cod_spettacolo = cod_spettacolo;
	}

	




	
	

}
