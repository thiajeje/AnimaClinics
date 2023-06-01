package com.example.demo5.services.interfaces;

import com.example.demo5.domain.Anamnese;
import com.example.demo5.domain.Paciente;

import java.util.List;

public interface AnamneseServiceAPI {

    public Anamnese get(Long id);

    public Anamnese getByPaciente(long pacienteId);

    public Anamnese create(Anamnese anamnese);

    public void update(Anamnese anamnese);

    public void remove(Long id);

}
