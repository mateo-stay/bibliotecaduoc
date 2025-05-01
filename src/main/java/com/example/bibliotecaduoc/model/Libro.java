package com.example.bibliotecaduoc.model;

import lombok.ALLArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@ALLArgsConstructor
@NoArgsConstructor
public class Libro {

    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;

}
