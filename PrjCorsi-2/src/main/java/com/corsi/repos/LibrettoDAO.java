package com.corsi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsi.entities.Libretto;
import com.corsi.entities.Studente;

public interface LibrettoDAO extends JpaRepository<Libretto, Long> {

}
