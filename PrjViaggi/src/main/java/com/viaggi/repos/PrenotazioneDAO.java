package com.viaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaggi.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
