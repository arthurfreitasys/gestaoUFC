package com.lab.jpa.gestaoufc.mapper;

import com.lab.jpa.gestaoufc.domain.model.Lutador;
import com.lab.jpa.gestaoufc.dto.LutadorRequestDTO;
import com.lab.jpa.gestaoufc.dto.LutadorResponseDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface LutadorMapper {
    LutadorResponseDTO toDto(Lutador entity);

    @Mapping(target = "id", ignore = true)
    Lutador toEntity(LutadorRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    void updateEntityFromDTO(LutadorRequestDTO dto, @MappingTarget Lutador entity);
}
