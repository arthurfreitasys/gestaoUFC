package com.lab.jpa.gestaoufc.dto;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record EventoResponseDTO(
    UUID id,
    String nomeEvento,
    LocalDate data,
    String localEvento
) {
}
