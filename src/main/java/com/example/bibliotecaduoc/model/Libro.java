package com.example.bibliotecaduoc.model;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}
