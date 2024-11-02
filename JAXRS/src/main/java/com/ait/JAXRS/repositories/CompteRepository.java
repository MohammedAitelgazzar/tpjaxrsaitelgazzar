package com.ait.JAXRS.repositories;

import com.ait.JAXRS.entities.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}
