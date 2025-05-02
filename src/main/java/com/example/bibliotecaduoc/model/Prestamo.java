package com.example.bibliotecaduoc.model;

import lombok.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Prestamo {
    private int idPrestamo;
    private int idLibro; 
    private String runSolicitante;
    private Date fechaSolicitud;
    private Date fechaEntrega; 
    private int cantidadDias;
    private int multas;
}