package com.teatro.services;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teatro.entities.Biglietto;
import com.teatro.entities.Cliente;
import com.teatro.entities.Replica;
import com.teatro.entities.Spettacolo;
import com.teatro.entities.Teatro;
import com.teatro.repos.BigliettoDAO;
import com.teatro.repos.ClienteDAO;
import com.teatro.repos.ReplicaDAO;
import com.teatro.repos.SpettacoloDAO;
import com.teatro.repos.TeatroDAO;


@Service
public class TeatroServiceImpl implements TeatroService {
	
	@Autowired
	BigliettoDAO bDao;
	
	@Autowired
	ClienteDAO cDao;
	
	@Autowired
	ReplicaDAO rDao;
	
	@Autowired
	SpettacoloDAO spDao;
	
	@Autowired
	TeatroDAO tDao;
	
	//////////////////////// READ

	@Override
	public List<Spettacolo> getSpettacoli() {
		return spDao.findAll();
	}

//	@Override
//	public Spettacolo getSpettacoloById(int id) {
//		return spDao.findById(id).get();
//	}


	@Override
	public List<Replica> getRepliche() {
		return rDao.findAll();
	}
//	@Override
//	public Replica getReplicaById(int id) {
//	    Optional<Replica> optionalReplica = rDao.findById(id);
//	    return optionalReplica.orElseThrow(() -> new EntityNotFoundException("Replica not found with id: " + id));
//	}
	

	@Override
	public List<Biglietto> getBiglietti() {
		return bDao.findAll();
	}

	@Override
	public List<Cliente> getClienti() {
		return cDao.findAll();
	}

	@Override
	public List<Teatro> getTeatri() {
		return tDao.findAll();
	}

	//////////////////////// CREATE
	
	@Override
	public Spettacolo addSpettacolo(Spettacolo s) {
		return spDao.save(s);
	}


	@Override
	public Replica addReplica(Replica r) {
		return rDao.save(r);
	}


	//////////////////////// UPDATE
	
	@Override
	public Spettacolo updSpettacolo(Spettacolo s) {
		return spDao.save(s);
	}


	@Override
	public Replica updReplica(Replica r) {
		return rDao.save(r);
	}

	
	//////////////////////// DELETE

	@Override
	public void delSpettacolo(Spettacolo s) {
		spDao.delete(s);
	}


	@Override
	public void delReplica(Replica r) {
		rDao.delete(r);
	}




	@Override
	public Biglietto addBiglietto(Biglietto b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Cliente addCliente(Cliente c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Teatro addTeatro(Teatro t) {
		// TODO Auto-generated method stub
		return null;
	}


}
