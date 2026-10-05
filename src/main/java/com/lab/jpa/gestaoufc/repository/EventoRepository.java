package com.lab.jpa.gestaoufc.repository;

import com.lab.jpa.gestaoufc.domain.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EventoRepository extends JpaRepository<Evento, UUID> {
}
