package com.example.demo5.Service;

import com.example.demo5.domain.Anamnese;

import com.example.demo5.exceptions.AnamneseNotFoundException;
import com.example.demo5.repositories.AnamneseRepository;
import com.example.demo5.services.interfaces.AnamneseServiceAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AnamneseService implements AnamneseServiceAPI {

    private final AnamneseRepository repository;

    @Autowired
    public AnamneseService(AnamneseRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Anamnese> findAll() {
        return repository.findAll();
    }
    @Override
    @Transactional(readOnly = true)
    public Anamnese get(Long id) {
        return repository.findById(id)
                .orElseThrow(()-> new AnamneseNotFoundException("Anamnese não encontrada"));
    }

    @Override
    @Transactional(readOnly = true)
    public Anamnese getByPaciente(long pacienteId){
        return repository.getByPaciente(pacienteId)
                .orElse(null);
    }

    @Override
    @Transactional(readOnly = false)
    public Anamnese create(Anamnese anamnese) {
        return repository.save(anamnese);
    }

    @Override
    @Transactional(readOnly = false)
    public void update(Anamnese anamnese) {
        repository.save(anamnese);
    }

    @Override
    @Transactional(readOnly = false)
    public void remove(Long id) {
        repository.deleteById(id);
    }
}

