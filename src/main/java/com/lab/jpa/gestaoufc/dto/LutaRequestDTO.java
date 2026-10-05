package com.lab.jpa.gestaoufc.dto;

import com.lab.jpa.gestaoufc.domain.enums.CategoriaPeso;
import com.lab.jpa.gestaoufc.domain.enums.ResultadoLuta;
import com.lab.jpa.gestaoufc.domain.model.Evento;
import com.lab.jpa.gestaoufc.domain.model.Lutador;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record LutaRequestDTO(

    @NotNull(message = "Evento é obrigatorio")
    UUID eventoID,

    @NotNull(message = "Lutador é obrigatorio")
    UUID lutador1ID,

    @NotNull(message = "Lutador é obrigatorio")
    UUID lutador2ID,

    @NotNull(message = "Categoria de peso é obrigatorio")
    CategoriaPeso categoriaPeso,

    ResultadoLuta resultadoLuta //Luta pode ainda não ter acontecido
    ) {
}
