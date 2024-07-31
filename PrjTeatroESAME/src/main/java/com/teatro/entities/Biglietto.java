package com.teatro.entities;

import java.time.LocalDate;

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
@Table(name = "Biglietti")
public class Biglietto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_operazione", length = 4)
	private int cod_operazione;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name= "cod_cliente")
	private Cliente cod_cliente;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name= "cod_replica")
	private Replica cod_replica;
	
	
	private LocalDate dataOra;
	
	@Column(name = "tipoPagamento", length = 20)
	private String tipoPagamento;
	
	private int quantita;

	public int getCod_operazione() {
		return cod_operazione;
	}

	public void setCod_operazione(int cod_operazione) {
		this.cod_operazione = cod_operazione;
	}


	public Cliente getCod_cliente() {
		return cod_cliente;
	}

	public void setCod_cliente(Cliente cod_cliente) {
		this.cod_cliente = cod_cliente;
	}

	public Replica getCod_replica() {
		return cod_replica;
	}

	public void setCod_replica(Replica cod_replica) {
		this.cod_replica = cod_replica;
	}

	public LocalDate getDataOra() {
		return dataOra;
	}

	public void setDataOra(LocalDate dataOra) {
		this.dataOra = dataOra;
	}

	public String getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(String tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}
	
	

}
