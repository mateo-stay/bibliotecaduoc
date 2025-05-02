package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.service.PrestamoService;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/prestamos")
public class PrestamoController {

    private final PrestamoService servicio;

    public PrestamoController(PrestamoService servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public ResponseEntity<List<Prestamo>> listarPrestamos() {
        return ResponseEntity.ok(servicio.listar());
    }

    @PostMapping
    public ResponseEntity<Prestamo> guardarPrestamo(@RequestBody Prestamo prestamo) {
        return new ResponseEntity<>(servicio.guardar(prestamo), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Prestamo> obtenerPrestamo(@PathVariable int id) {
        Prestamo p = servicio.obtenerPorId(id);
        return (p != null) ? ResponseEntity.ok(p) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Prestamo> actualizarPrestamo(@PathVariable int id, @RequestBody Prestamo prestamo) {
        Prestamo actualizado = servicio.actualizar(id, prestamo);
        return (actualizado != null) ? ResponseEntity.ok(actualizado) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPrestamo(@PathVariable int id) {
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}