package com.example.demo5.Service;

import com.example.demo5.domain.Agendamento;
import com.example.demo5.repositories.AgendamentoRepository;
import com.example.demo5.services.interfaces.AgendamentoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService implements AgendamentoServiceAPI {

    private final AgendamentoRepository agendamentoRepository;

    @Autowired
    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    public Agendamento criarAgendamento(Agendamento agendamento) {
        // Lógica para criar um novo agendamento
        return agendamentoRepository.save(agendamento);
    }

    @Override
    public List<Agendamento> findAll() {
        // Lógica para obter todos os agendamentos existentes
        return agendamentoRepository.findAll();
    }
}
