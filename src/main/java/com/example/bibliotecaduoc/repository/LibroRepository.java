package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class LibroRepository {
    private List<Libro> listaLibros = new ArrayList<>();

    public List<Libro> obtenerLibros() {
        return listaLibros;
    }

    public Libro buscarPorId(int id) {
        return listaLibros.stream().filter(l -> l.getId() == id).findFirst().orElse(null);
    }

    public Libro buscarPorIsbn(String isbn) {
        return listaLibros.stream().filter(l -> l.getIsbn().equals(isbn)).findFirst().orElse(null);
    }

    public Libro guardar(Libro libro) {
        listaLibros.add(libro);
        return libro;
    }

    public Libro actualizar(int id, Libro libro) {
        Libro existente = buscarPorId(id);
        if (existente != null) {
            listaLibros.remove(existente);
            listaLibros.add(libro);
            return libro;
        }
        return null;
    }

    public void eliminar(int id) {
        listaLibros.removeIf(l -> l.getId() == id);
    }
}
