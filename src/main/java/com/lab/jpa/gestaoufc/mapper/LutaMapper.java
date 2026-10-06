package com.lab.jpa.gestaoufc.mapper;

import com.lab.jpa.gestaoufc.domain.model.Luta;
import com.lab.jpa.gestaoufc.dto.LutaResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LutaMapper {

    @Mapping(target = "nomeEvento", source = "evento.nomeEvento")
    @Mapping(target = "nomeLutador1", source = "lutador1.nome")
    @Mapping(target = "nomeLutador2", source = "lutador2.nome")
    LutaResponseDTO toDTO(Luta entity);
}