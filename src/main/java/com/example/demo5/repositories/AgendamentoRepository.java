package com.example.demo5.repositories;

import com.example.demo5.domain.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
//    List<Agendamento> findByData(LocalDate data);
    @Query("select age from Agendamento age where age.paciente.id = ?1 and age.usuario.id = ?2 and age.dataHora >= ?3 and age.status = ?4")
    List<Agendamento> findBy(Long pacienteId, Long medicoId, Date dataHora, String status);
    @Query("select age from Agendamento age where age.usuario.id = ?1 and age.dataHora = ?2")
    List<Agendamento> validadeBy(Long medicoId, Date dataHora);


}