package com.example.bibliotecaduoc;

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
}
