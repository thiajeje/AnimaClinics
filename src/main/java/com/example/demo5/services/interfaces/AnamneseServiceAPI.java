package com.example.demo5.services.interfaces;

import com.example.demo5.domain.Anamnese;

import java.util.List;

public interface AnamneseServiceAPI {

    public Anamnese get(Long id);

    public Anamnese getByPaciente(long pacienteId);

    List<Anamnese> findAll();

    public Anamnese create(Anamnese anamnese);

    public void update(Anamnese anamnese);

    public void remove(Long id);

}
