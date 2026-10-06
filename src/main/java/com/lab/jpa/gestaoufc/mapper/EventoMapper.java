package com.lab.jpa.gestaoufc.mapper;

import com.lab.jpa.gestaoufc.domain.model.Evento;
import com.lab.jpa.gestaoufc.dto.EventoRequestDTO;
import com.lab.jpa.gestaoufc.dto.EventoResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface EventoMapper {
    EventoResponseDTO toDTO(Evento entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "lutas", ignore = true)
    Evento toEntity(EventoRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDTO(EventoRequestDTO dto, @MappingTarget Evento entity);
}
