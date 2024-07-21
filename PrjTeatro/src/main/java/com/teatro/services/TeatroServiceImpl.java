package com.teatro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatro.entities.Posto;
import com.teatro.entities.Prenotazione;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;
import com.teatro.repos.PostoDAO;
import com.teatro.repos.PrenotazioneDAO;
import com.teatro.repos.ReplicaDAO;
import com.teatro.repos.SpettacoloDAO;

import jakarta.persistence.EntityNotFoundException;

@Service
public class TeatroServiceImpl implements TeatroService {
	
	@Autowired
	SpettacoloDAO spDao;
	
	@Autowired
	PostoDAO pDao;
	
	@Autowired
	ReplicaDAO rDao;
	
	@Autowired
	PrenotazioneDAO prenotDao;
	
	//////////////////////// READ

	@Override
	public List<Spettacolo> getSpettacoli() {
		return spDao.findAll();
	}

	@Override
	public Spettacolo getSpettacoloById(int id) {
		return spDao.findById(id).get();
	}

	@Override
	public List<Posto> getPosti() {
		return pDao.findAll();
	}

	@Override
	public List<Replica> getRepliche() {
		return rDao.findAll();
	}
	@Override
	public Replica getReplicaById(int id) {
	    Optional<Replica> optionalReplica = rDao.findById(id);
	    return optionalReplica.orElseThrow(() -> new EntityNotFoundException("Replica not found with id: " + id));
	}


	@Override
	public List<Prenotazione> getPrenotazioni() {
		return prenotDao.findAll();
	}

	//////////////////////// CREATE
	
	@Override
	public Spettacolo addSpettacolo(Spettacolo s) {
		return spDao.save(s);
	}

	@Override
	public Posto addPosto(Posto p) {
		return pDao.save(p);
	}

	@Override
	public Replica addReplica(Replica r) {
		return rDao.save(r);
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		return prenotDao.save(p);
	}

	//////////////////////// UPDATE
	
	@Override
	public Spettacolo updSpettacolo(Spettacolo s) {
		return spDao.save(s);
	}

	@Override
	public Posto updPosto(Posto p) {
		return pDao.save(p);
	}

	@Override
	public Replica updReplica(Replica r) {
		return rDao.save(r);
	}

	@Override
	public Prenotazione updPrenotazione(Prenotazione p) {
		return prenotDao.save(p);
	}
	
	//////////////////////// DELETE

	@Override
	public void delSpettacolo(Spettacolo s) {
		spDao.delete(s);
	}

	@Override
	public void delPosto(Posto p) {
		pDao.delete(p);
	}

	@Override
	public void delReplica(Replica r) {
		rDao.delete(r);
	}

	@Override
	public void delPrenotazione(Prenotazione p) {
		prenotDao.delete(p);
	}

}
