package com.gniuscode.padron.padron_service.service.impl;

import com.gniuscode.padron.padron_service.dto.PersonaDTO;
import com.gniuscode.padron.padron_service.exception.NoEncontradoException;
import com.gniuscode.padron.padron_service.mapper.PersonaMapper;
import com.gniuscode.padron.padron_service.model.Persona;
import com.gniuscode.padron.padron_service.repository.PersonaRepository;
import com.gniuscode.padron.padron_service.service.IPadronService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class PadronServiceImpl implements IPadronService {
    private final PersonaRepository repo;
    private final PersonaMapper mapper;

    @Override
    @Transactional(readOnly = true)
    public PersonaDTO buscarPorDni(String dni) {
        return repo.findByDni(Integer.parseInt(dni))
                .map(mapper::toDto)
                .orElseThrow(() -> new NoEncontradoException(dni));
    }

}
