package com.example.demo5.services.interfaces;

import com.example.demo5.domain.Agendamento;

import java.util.Date;
import java.util.List;

public interface AgendamentoServiceAPI {

    Agendamento criarAgendamento(Agendamento agendamento);
    Agendamento get(Long id);
    List<Agendamento> findAll();
    List<Agendamento> findBy(Long pacienteId, Long medicoId, Date dataHora, String status);
    boolean existsAgendamentoByMedicoIdAndDataHora(Long medicoId, Date dataHora);


}
