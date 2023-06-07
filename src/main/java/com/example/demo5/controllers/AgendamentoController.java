package com.example.demo5.controllers;

import com.example.demo5.domain.Agendamento;
import com.example.demo5.domain.Usuario;
import com.example.demo5.services.interfaces.AgendamentoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
@CrossOrigin()
public class AgendamentoController {

    private final AgendamentoServiceAPI agendamentoService;

    @Autowired
    public AgendamentoController(AgendamentoServiceAPI agendamentoService) {
        this.agendamentoService = agendamentoService;
    }


    @GetMapping
    public List<Agendamento> getAllAgendamentos() {
        return agendamentoService.findAll();
    }
    @GetMapping(value = "/{id}")
    public HttpEntity<Agendamento> get(@PathVariable(name = "id") Long id) {
        Agendamento agendamento = agendamentoService.get(id);
        return ResponseEntity.ok(agendamento);
    }


    @PostMapping
    public ResponseEntity<?> criarAgendamento(@RequestBody Agendamento agendamento) {
        try {
            Agendamento novoAgendamento = agendamentoService.criarAgendamento(agendamento);
            return ResponseEntity.status(HttpStatus.CREATED).body(novoAgendamento);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Erro ao criar agendamento.");
        }
    }
}
