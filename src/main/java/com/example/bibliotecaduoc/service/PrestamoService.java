package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {
    private final PrestamoRepository repo;

    public PrestamoService(PrestamoRepository repo) {
        this.repo = repo;
    }

    public List<Prestamo> listar() {
        return repo.obtenerTodos();
    }

    public Prestamo guardar(Prestamo prestamo) {
        return repo.guardar(prestamo);
    }

    public Prestamo obtenerPorId(int id) {
        return repo.buscarPorId(id);
    }

    public Prestamo actualizar(int id, Prestamo prestamo) {
        return repo.actualizar(id, prestamo);
    }

    public void eliminar(int id) {
        repo.eliminar(id);
    }
}