package com.teatro.entities;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Replica {
	
	public Replica() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int replica_id;
	
	private LocalDate data;
	private LocalTime ora;
	
    @OneToOne(mappedBy = "replica", cascade = CascadeType.ALL)
    private Prenotazione prenotazione;
	
	public int getId() {
		return replica_id;
	}
	public void setId(int id) {
		this.replica_id = id;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public LocalTime getOra() {
		return ora;
	}
	public void setOra(LocalTime ora) {
		this.ora = ora;
	}
	@Override
	public String toString() {
		return "Replica [id=" + replica_id + ", data=" + data + ", ora=" + ora + "]";
	}
	
	

}
