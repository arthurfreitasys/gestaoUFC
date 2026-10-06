package com.lab.jpa.gestaoufc.dto;

import com.lab.jpa.gestaoufc.domain.enums.CategoriaPeso;

import java.util.UUID;

public record LutadorResponseDTO( // O que a API devolve

        UUID id,
        String nome,
        String apelido,
        CategoriaPeso categoriaPeso,
        Integer vitorias,
        Integer derrotas,
        Integer empates,
        String paisOrigem

) {
}
