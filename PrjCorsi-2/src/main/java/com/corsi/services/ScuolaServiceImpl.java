package com.corsi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corsi.entities.Libretto;
import com.corsi.entities.Studente;
import com.corsi.repos.LibrettoDAO;
import com.corsi.repos.StudenteDAO;

@Service
public class ScuolaServiceImpl implements ScuolaService {
	
	@Autowired
	private StudenteDAO dao;
	
	@Autowired
	private LibrettoDAO librettoDAO;

	@Override
	public List<Studente> getStudenti() {
		return dao.findAll();
	}

	@Override
	public List<Libretto> getLibretti() {
		return librettoDAO.findAll();
	}

	@Override
	public Studente addStudente(Studente s) {
		return dao.save(s);
	}

	@Override
	public Libretto addLibretto(Libretto l) {
		return librettoDAO.save(l);
	}

}
