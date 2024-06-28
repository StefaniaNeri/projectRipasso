package com.teatro.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prenotazione;
	
    private String nomeCliente;
    private Date dataPrenotazione;
    
    @OneToOne
    private Replica replica;
    
    @OneToMany(mappedBy = "prenotazione")
    private Set<Biglietto> biglietti;

	public int getId() {
		return id_prenotazione;
	}

	public void setId(int id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Date getDataPrenotazione() {
		return dataPrenotazione;
	}

	public void setDataPrenotazione(Date dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}

	public Replica getReplica() {
		return replica;
	}

	public void setReplica(Replica replica) {
		this.replica = replica;
	}

	public Set<Biglietto> getBiglietti() {
		return biglietti;
	}

	public void setBiglietti(Set<Biglietto> biglietti) {
		this.biglietti = biglietti;
	}
    

}
