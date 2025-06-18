package com.gniuscode.padron.padron_service.repository;

import com.gniuscode.padron.padron_service.dto.PersonaDTO;
import com.gniuscode.padron.padron_service.model.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface PersonaRepository extends MongoRepository<Persona, String> {
    Optional<Persona>  findByDni(Integer dni);
}
