package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> obtenerLibros() {
        return libroRepository.obtenerLibros();
    }

    public Libro buscarPorId(int id) {
        return libroRepository.buscarPorId(id);
    }

    public Libro guardar(Libro libro) {
        return libroRepository.guardar(libro);
    }

    public Libro actualizar(int id, Libro libro) {
        return libroRepository.actualizar(id, libro);
    }

    public void eliminar(int id) {
        libroRepository.eliminar(id);
    }

    public int totalLibrosV1(){
        return libroRepository.obtenerLibros().size();
    }

    public int totalLibrosV2(){
        return libroRepository.totalLibros();
    }
    public Libro buscarPorIsbn(String isbn) {
        return libroRepository.buscarPorIsbn(isbn);
    }
    public int contarLibrosPorAno(int ano) {
        return libroRepository.contarLibrosPorAno(ano);
    }
    public List<Libro> buscarPorAutor(String autor) {
        return libroRepository.buscarPorAutor(autor);
    }
    public Libro buscarLibroMasAntiguo() {
        return libroRepository.buscarLibroMasAntiguo();
    }    
    public Libro buscarLibroMasNuevo() {
        return libroRepository.buscarLibroMasNuevo();
    }    
    public List<Libro> listarLibrosOrdenadosPorAnio() {
        return libroRepository.listarLibrosOrdenadosPorAnio();
    }    
}
