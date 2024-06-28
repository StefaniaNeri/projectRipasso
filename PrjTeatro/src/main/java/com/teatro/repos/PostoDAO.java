package com.teatro.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.teatro.entities.Posto;

@Repository
public interface PostoDAO extends JpaRepository<Posto, Integer> {

}
