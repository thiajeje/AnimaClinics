package com.example.demo5.services.interfaces;

import com.example.demo5.domain.Paciente;

import java.util.List;

public interface PacienteServiceAPI {

    public Paciente get(Long id);

    public List<Paciente> findAll();

    public Paciente create(Paciente paciente);

    public void update(Paciente paciente);

    public void remove(Long id);

}
