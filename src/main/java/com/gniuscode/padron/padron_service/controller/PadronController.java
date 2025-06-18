package com.gniuscode.padron.padron_service.controller;

import com.gniuscode.padron.padron_service.dto.PersonaDTO;
import com.gniuscode.padron.padron_service.model.Persona;
import com.gniuscode.padron.padron_service.service.impl.PadronServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/padron/cip")
@RequiredArgsConstructor
@Validated
public class PadronController {

    private final PadronServiceImpl padronService;

    @GetMapping("/{dni}")
    public PersonaDTO  get(@PathVariable String dni) {
        return padronService.buscarPorDni(dni);
    }
}
