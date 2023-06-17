package com.example.demo5.controllers;

import com.example.demo5.domain.Anamnese;
import com.example.demo5.domain.Paciente;
import com.example.demo5.domain.Usuario;
import com.example.demo5.services.interfaces.AnamneseServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/anamnese")
@CrossOrigin()
public class AnamneseController {

    private final AnamneseServiceAPI anamneseService;

    @Autowired
    public AnamneseController(AnamneseServiceAPI anamneseService) {
        this.anamneseService = anamneseService;
    }

    @GetMapping(value = "/{id}")
    public HttpEntity<Anamnese> get(@PathVariable(name = "id") Long id) {
        Anamnese anamnese = anamneseService.get(id);
        return ResponseEntity.ok(anamnese);
    }

    @GetMapping
    public HttpEntity<List<Anamnese>> findAll() {
        List<Anamnese> paciente = anamneseService.findAll();
        return ResponseEntity.ok(paciente);
    }

    @PostMapping
    public HttpEntity<Anamnese> create(@RequestBody Anamnese anamnese) {
        anamnese = anamneseService.create(anamnese);
        return ResponseEntity.ok(anamnese);
    }

    @PutMapping(value = "/{id}")
    public HttpEntity<Anamnese> update(@PathVariable(name = "id") Long id, @RequestBody Anamnese anamnese) {
        anamnese.setId(id);
        anamneseService.update(anamnese);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping(value = "/{id}")
    public HttpEntity<Anamnese> remove(@PathVariable(name = "id") Long id) {
        anamneseService.remove(id);
        return ResponseEntity.ok().build();
    }
}
