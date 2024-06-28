package com.teatro.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatro.entities.Prenotazione;

@Repository
public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
