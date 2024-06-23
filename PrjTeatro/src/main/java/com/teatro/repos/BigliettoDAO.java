package com.teatro.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatro.entities.Biglietto;

@Repository
public interface BigliettoDAO extends JpaRepository<Biglietto, Integer> {

}
