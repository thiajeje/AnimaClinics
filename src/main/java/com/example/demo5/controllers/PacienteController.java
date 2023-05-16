package com.example.demo5.controllers;

import com.example.demo5.domain.Paciente;
import com.example.demo5.domain.Usuario;
import com.example.demo5.services.interfaces.PacienteServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
@CrossOrigin()
public class PacienteController {

    private final PacienteServiceAPI pacienteService;

    @Autowired
    public PacienteController(PacienteServiceAPI pacienteService) {
        this.pacienteService = pacienteService;
    }

    @GetMapping
    public HttpEntity<List<Paciente>> findAll() {
        List<Paciente> paciente = pacienteService.findAll();
        return ResponseEntity.ok(paciente);
    }

    @GetMapping(value = "/{id}")
    public HttpEntity<Paciente> get(@PathVariable(name = "id") Long id) {
        Paciente paciente = pacienteService.get(id);
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    public HttpEntity<Paciente> create(@RequestBody Paciente paciente) {
        paciente = pacienteService.create(paciente);
        return ResponseEntity.ok(paciente);
    }

    @PutMapping(value = "/{id}")
    public HttpEntity<Paciente> update(@PathVariable(name = "id") Long id, @RequestBody Paciente paciente) {
        paciente.setId(id);
        pacienteService.update(paciente);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public HttpEntity<Usuario> remove(@PathVariable(name = "id") Long id) {
        pacienteService.remove(id);
        return ResponseEntity.ok().build();
    }
}
