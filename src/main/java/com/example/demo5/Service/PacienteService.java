package com.example.demo5.Service;

import com.example.demo5.domain.Paciente;
import com.example.demo5.exceptions.PacienteNotFoundException;
import com.example.demo5.repositories.PacienteRepository;
import com.example.demo5.services.interfaces.PacienteServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteService implements PacienteServiceAPI {

    private final PacienteRepository repository;

    @Autowired
    public PacienteService(PacienteRepository repository) {
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public Paciente get(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new PacienteNotFoundException("Paciente não encontrado"));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paciente> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = false)
    public Paciente create(Paciente paciente) {
        return repository.save(paciente);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Paciente paciente) {
        repository.save(paciente);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repository.deleteById(id);
    }
}

