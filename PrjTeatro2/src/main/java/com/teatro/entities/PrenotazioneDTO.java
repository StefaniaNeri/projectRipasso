package com.teatro.entities;

import java.sql.Date;

public class PrenotazioneDTO {
	

		private Date dataPrenotazione;
		private String titoloSpettacolo;
		private int replicaId; // ID della replica
		
		public Date getDataPrenotazione() {
			return dataPrenotazione;
		}
		public void setDataPrenotazione(Date dataPrenotazione) {
			this.dataPrenotazione = dataPrenotazione;
		}
		public String getTitoloSpettacolo() {
			return titoloSpettacolo;
		}
		public void setTitoloSpettacolo(String titoloSpettacolo) {
			this.titoloSpettacolo = titoloSpettacolo;
		}
		public int getReplicaId() {
			return replicaId;
		}
		public void setReplicaId(int replicaId) {
			this.replicaId = replicaId;
		}	

}
