package com.example.demo5.repositories;

import com.example.demo5.domain.Anamnese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AnamneseRepository extends JpaRepository<Anamnese, Long> {

    @Query("select anamnese from Anamnese anamnese where anamnese.paciente.id = ?1")
    public Optional<Anamnese> getByPaciente(long pacienteId);
}
