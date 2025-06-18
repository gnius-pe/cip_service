package com.gniuscode.padron.padron_service.service;

import com.gniuscode.padron.padron_service.dto.PersonaDTO;

public interface IPadronService {
    public PersonaDTO buscarPorDni(String dni);
}
