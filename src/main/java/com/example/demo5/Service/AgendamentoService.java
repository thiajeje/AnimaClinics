package com.example.demo5.Service;

import com.example.demo5.domain.Agendamento;
import com.example.demo5.repositories.AgendamentoRepository;
import com.example.demo5.services.interfaces.AgendamentoServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AgendamentoService implements AgendamentoServiceAPI {

    private final AgendamentoRepository agendamentoRepository;

    @Autowired
    public AgendamentoService(AgendamentoRepository agendamentoRepository) {
        this.agendamentoRepository = agendamentoRepository;
    }

    @Override
    @Transactional
    public Agendamento criarAgendamento(Agendamento agendamento) {
        // Lógica para criar um novo agendamento
        if (existsAgendamentoByMedicoIdAndDataHora(agendamento.getUsuario().getId(), agendamento.getDataHora())){
            throw new IllegalArgumentException("Horário já agendado, tente outro horário!");
        };
        if(agendamento.getDataHora().getTime()< new Date().getTime()){
            throw new IllegalArgumentException("Data menor que a data atual!");
        };
        agendamento = agendamentoRepository.save(agendamento);
        return agendamentoRepository.findById(agendamento.getId()).orElse(null);
    }

    @Override
    public Agendamento get(Long id) {
        return agendamentoRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agendamento> findAll() {
        // Lógica para obter todos os agendamentos existentes
        return agendamentoRepository.findAll();
    }

    @Override
    public List<Agendamento> findBy(Long pacienteId, Long medicoId, Date dataHora, String status){
        return agendamentoRepository.findBy(pacienteId, medicoId, dataHora, status);
    }

    @Override
    public boolean existsAgendamentoByMedicoIdAndDataHora(Long medicoId, Date dataHora){
        return !agendamentoRepository.validadeBy(medicoId, dataHora).isEmpty();
    }

}
