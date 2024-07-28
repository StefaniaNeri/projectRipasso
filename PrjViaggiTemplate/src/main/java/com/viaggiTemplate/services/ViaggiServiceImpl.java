package com.viaggiTemplate.services;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viaggiTemplate.entities.Prenotazione;
import com.viaggiTemplate.entities.Utente;
import com.viaggiTemplate.entities.Viaggio;
import com.viaggiTemplate.repos.PrenotazioneDAO;
import com.viaggiTemplate.repos.UtenteDAO;
import com.viaggiTemplate.repos.ViaggioDAO;

@Service
public class ViaggiServiceImpl implements ViaggiServices{
	
	@Autowired
	private ViaggioDAO vDao;
	
	@Autowired
	private UtenteDAO uDao;
	
	@Autowired
	private PrenotazioneDAO pDao;

	@Override
	public List<Utente> getUtenti() {
		return uDao.findAll();
	}

	@Override
	public List<Viaggio> getViaggi() {
		return vDao.findAll();
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		return pDao.findAll();
	}

	@Override
	public Utente addUtente(Utente u) {
		return uDao.save(u);
	}

	@Override
	public Viaggio addViaggio(Viaggio v) {
		return vDao.save(v);
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		
		 if (p.getViaggi() != null) {
			 
			 Set<Viaggio> viaggi = p.getViaggi();
			 p.setViaggi(viaggi);
			 
             }
		
		 for (Viaggio viaggio : p.getViaggi()) {
	            viaggio.setPrenotazione(p);
	        }
		 
		 Utente u = p.getUtente();
	        if (u != null) {
	        	  if (u.getPrenotazioni() == null) {
	                  u.setPrenotazioni(new HashSet<>());
	              }
	            u.getPrenotazioni().add(p);
	            p.setUtente(u);
	            uDao.save(u); // Salva l'utente aggiornato
	        }
	     
		 
		return pDao.save(p);
	}

	@Override
	public Utente updUtente(Utente u) {
		return uDao.save(u);
	}

	@Override
	public Viaggio updViaggio(Viaggio v) {
		return vDao.save(v);
	}

	@Override
	public Prenotazione updPrenotazione(Prenotazione p) {
		return pDao.save(p);
	}

	@Override
	public void delUtente(Utente u) {
		uDao.delete(u);
		
	}

	@Override
	public void delViaggio(Viaggio v) {
		vDao.delete(v);
	}

	@Override
	public void delPrenotazione(Prenotazione p) {
		pDao.delete(p);
	}

}
