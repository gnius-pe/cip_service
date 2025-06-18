package com.gniuscode.padron.padron_service.mapper;

import com.gniuscode.padron.padron_service.dto.PersonaDTO;
import com.gniuscode.padron.padron_service.model.Persona;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PersonaMapper {
    PersonaDTO toDto(Persona entity);
}
