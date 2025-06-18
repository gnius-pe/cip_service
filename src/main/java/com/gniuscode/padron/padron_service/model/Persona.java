package com.gniuscode.padron.padron_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "cip")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {
    @Id
    private String id;
    private Integer dni;          // Int32 en Mongo
    private Integer registroCip;  // Int32
    private Integer telefono;     // Int32 (cabe dentro de ±2 147 483 647)
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String nombres;
    private String correo;
    private String departamento;
    private String capitulo;
}
