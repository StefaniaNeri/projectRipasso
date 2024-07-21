package com.teatro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.teatro.entities.Posto;
import com.teatro.entities.Prenotazione;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;

@Service
public interface TeatroService {
	
	List<Spettacolo> getSpettacoli();
	Spettacolo getSpettacoloById(int id);
	List<Posto> getPosti();
	List<Replica> getRepliche();
	List<Prenotazione> getPrenotazioni();
	
	Spettacolo addSpettacolo(Spettacolo s);
	Posto addPosto(Posto p);
	Replica addReplica(Replica r);
	Prenotazione addPrenotazione(Prenotazione p);
	
	Spettacolo updSpettacolo(Spettacolo s);
	Posto updPosto(Posto p);
	Replica updReplica(Replica r);
	Prenotazione updPrenotazione(Prenotazione p);

	void delSpettacolo(Spettacolo s);
	void delPosto(Posto p);
	void delReplica(Replica r);
	void delPrenotazione(Prenotazione p);
	Replica getReplicaById(int id);
	
}
