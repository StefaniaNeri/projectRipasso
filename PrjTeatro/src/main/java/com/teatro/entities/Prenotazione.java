package com.teatro.entities;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Prenotazione {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prenotazione;
	
    private String titoloSpettacolo;
    private Date dataPrenotazione;
    
    @OneToOne
    @JoinColumn(name = "replica_id")
    private Replica replica;
   

	public int getId() {
		return id_prenotazione;
	}

	public void setId(int id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public String getTitoloSpettacolo() {
		return titoloSpettacolo;
	}

	public void setTitoloSpettacolo(String titoloSpettacolo) {
		this.titoloSpettacolo = titoloSpettacolo;
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


}
