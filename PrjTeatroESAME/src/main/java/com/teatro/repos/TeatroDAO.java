package com.teatro.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teatro.entities.Teatro;

public interface TeatroDAO extends JpaRepository<Teatro, String> {

}
