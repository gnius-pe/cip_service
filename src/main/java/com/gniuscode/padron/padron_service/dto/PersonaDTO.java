package com.gniuscode.padron.padron_service.dto;

public record  PersonaDTO
        (
                String dni,
           String apellidoPaterno,
           String apellidoMaterno,
           String nombres,
           String departamento,
           String capitulo)
{ }