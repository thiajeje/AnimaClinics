package com.example.demo5.services.interfaces;

import com.example.demo5.domain.Agendamento;

import java.util.List;

public interface AgendamentoServiceAPI {

    Agendamento criarAgendamento(Agendamento agendamento);
    Agendamento get(Long id);
    List<Agendamento> findAll();
}
