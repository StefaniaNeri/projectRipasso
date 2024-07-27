package com.viaggi.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.viaggi.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {

}
