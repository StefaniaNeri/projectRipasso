package com.corsi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corsi.entities.Studente;

public interface StudenteDAO extends JpaRepository<Studente, Long> {

}
