package com.lab.jpa.gestaoufc.dto;

import com.lab.jpa.gestaoufc.domain.enums.CategoriaPeso;
import com.lab.jpa.gestaoufc.domain.enums.ResultadoLuta;

import java.util.UUID;

public record LutaResponseDTO(
        UUID id,
        String nomeEvento,
        String nomeLutador1,
        String nomeLutador2,
        CategoriaPeso categoriaPeso,
        ResultadoLuta resultadoLuta
) {
}
