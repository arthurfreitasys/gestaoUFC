package com.lab.jpa.gestaoufc.dto;

import com.lab.jpa.gestaoufc.domain.enums.CategoriaPeso;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public record LutadorRequestDTO( // O que o usuario registra
        @NotBlank(message = "O nome é obrigatorio")
        String nome,

        String apelido,

        @NotNull(message = "A categoria do atleta é obrigatoria")
        CategoriaPeso categoriaPeso,

        @NotNull(message = "Número de vitorias não pode estar vazio")
        @PositiveOrZero(message = "Número de vitorias deve ser um número positivo ou zero")
        Integer vitorias,

        @NotNull(message = "Número de empates não pode estar vazia")
        @PositiveOrZero(message = "Número de empates deve ser um número positivo ou zero")
        Integer empates,

        @NotNull(message = "Número de derrotas não pode estar vazia")
        @PositiveOrZero(message = "Número de derrotas deve ser um número positivo ou zero")
        Integer derrotas,

        @NotBlank(message = "O pais de origem não pode estar vazio")
        String paisOrigem


) {
}
