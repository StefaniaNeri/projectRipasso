package com.teatro.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.teatro.entities.Biglietto;
import com.teatro.entities.Cliente;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;
import com.teatro.entities.Teatro;

@Service
public interface TeatroService {
	
	List<Biglietto> getBiglietti();
	List<Cliente> getClienti();
	List<Replica> getRepliche();
	List<Spettacolo> getSpettacoli();
//	Spettacolo getSpettacoloById(int id);
	List<Teatro> getTeatri();
	
	Biglietto addBiglietto(Biglietto b);
	Cliente addCliente(Cliente c);
	Replica addReplica(Replica r);
	Spettacolo addSpettacolo(Spettacolo s);
	Teatro addTeatro(Teatro t);
	
	Biglietto updBiglietto(Biglietto b);
	Cliente updCliente(Cliente c);
	Replica updReplica(Replica r);
	Spettacolo updSpettacolo(Spettacolo s);
	Teatro updTeatro(Teatro t);

	void delBiglietto(Biglietto b);
	void delCliente(Cliente c);
	void delTeatro(Teatro t);
	void delReplica(Replica r);
	void delSpettacolo(Spettacolo s);
//	Replica getReplicaById(int id);
	
}
