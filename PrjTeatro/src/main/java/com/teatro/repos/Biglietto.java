package com.teatro.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Biglietto extends JpaRepository<Biglietto, Integer> {

}
