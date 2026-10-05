package com.lab.jpa.gestaoufc.repository;

import com.lab.jpa.gestaoufc.domain.model.Lutador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface LutadorRepository extends JpaRepository<Lutador, UUID> {
}
