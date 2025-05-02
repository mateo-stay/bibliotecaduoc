package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class PrestamoRepository {
    private final List<Prestamo> prestamos = new ArrayList<>();
    private int contadorId = 1;

    public List<Prestamo> obtenerTodos() {
        return prestamos;
    }

    public Prestamo guardar(Prestamo prestamo) {
        prestamo.setIdPrestamo(contadorId++);
        prestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(int id) {
        return prestamos.stream().filter(p -> p.getIdPrestamo() == id).findFirst().orElse(null);
    }

    public Prestamo actualizar(int id, Prestamo prestamoActualizado) {
        Prestamo existente = buscarPorId(id);
        if (existente != null) {
            prestamos.remove(existente);
            prestamoActualizado.setIdPrestamo(id);
            prestamos.add(prestamoActualizado);
            return prestamoActualizado;
        }
        return null;
    }

    public void eliminar(int id) {
        prestamos.removeIf(p -> p.getIdPrestamo() == id);
    }
}