package com.viaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaggi.entities.Utente;

public interface UtenteDAO extends JpaRepository<Utente, Integer> {

}
