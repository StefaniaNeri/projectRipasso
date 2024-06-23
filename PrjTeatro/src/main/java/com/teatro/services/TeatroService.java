package com.teatro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teatro.entities.Biglietto;
import com.teatro.entities.Posto;
import com.teatro.entities.Prenotazione;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;

@Service
public interface TeatroService {
	
	List<Spettacolo> getSpettacoli();
	List<Biglietto> getBiglietti();
	List<Posto> getPosti();
	List<Replica> getRepliche();
	List<Prenotazione> getPrenotazioni();
	
	Spettacolo addSpettacolo(Spettacolo s);
	Biglietto addBiglietto(Biglietto b);
	Posto addPosto(Posto p);
	Replica addReplica(Replica r);
	Prenotazione addPrenotazione(Prenotazione p);
	
	Spettacolo updSpettacolo(Spettacolo s);
	Biglietto updBiglietto(Biglietto b);
	Posto updPosto(Posto p);
	Replica updReplica(Replica r);
	Prenotazione updPrenotazione(Prenotazione p);

	void updSpettacolo();
	void updBiglietto();
	void updPosto();
	void updReplica();
	void updPrenotazione();
	
}
