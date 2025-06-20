package com.gniuscode.padron.padron_service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class NoEncontradoException extends RuntimeException {
    public NoEncontradoException(String dni) {
        super("DNI " + dni + " no encontrado");
    }
}
