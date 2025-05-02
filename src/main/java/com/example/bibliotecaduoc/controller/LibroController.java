package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Libro;
import com.example.bibliotecaduoc.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    @GetMapping
    public List<Libro> obtenerLibros() {
        return libroService.obtenerLibros();
    }

    @GetMapping("/{id}")
    public Libro buscarPorId(@PathVariable int id) {
        return libroService.buscarPorId(id);
    }

    @PostMapping
    public Libro guardar(@RequestBody Libro libro) {
        return libroService.guardar(libro);
    }

    @PutMapping("/{id}")
    public Libro actualizar(@PathVariable int id, @RequestBody Libro libro) {
        return libroService.actualizar(id, libro);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        libroService.eliminar(id);
    }

    @GetMapping("/total")
    public int totalLibrosV2() {
        return libroService.totalLibrosV2();
    }

    @GetMapping("/isbn/{isbn}")
    public Libro buscarPorIsbn(@PathVariable String isbn) {
        return libroService.buscarPorIsbn(isbn);
    }

    @GetMapping("/totalPorAño/{año}")
    public int contarLibrosPorAno(@PathVariable("año") int ano) {
        return libroService.contarLibrosPorAno(ano);
    }  
    
    @GetMapping("/autor/{autor}")
    public List<Libro> buscarPorAutor(@PathVariable String autor) {
        return libroService.buscarPorAutor(autor);
    }

    @GetMapping("/antiguo")
    public Libro buscarLibroMasAntiguo() {
        return libroService.buscarLibroMasAntiguo();
    }

    @GetMapping("/nuevo")
    public Libro buscarLibroMasNuevo() {
        return libroService.buscarLibroMasNuevo();
    }

    @GetMapping("/ordenados")
    public List<Libro> listarLibrosOrdenadosPorAnio() {
        return libroService.listarLibrosOrdenadosPorAnio();
    }

}
