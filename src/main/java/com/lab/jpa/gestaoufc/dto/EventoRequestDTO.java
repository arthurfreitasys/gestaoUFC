package com.lab.jpa.gestaoufc.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record EventoRequestDTO(
        @NotBlank(message = "O nome do evento é obrigatorio")
        String nomeEvento,

        @NotNull(message = "Data do evento é obrigatoria")
        LocalDate data,

        @NotBlank(message = "Local do evento é obrigatorio")
        String localEvento

       //lista de lutas podem ser modificadas, excluidas, adicionadas, etc..

) {
}
