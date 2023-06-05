package com.example.demo5.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long id_criador;
    private Long id_medico;
    private Long id_paciente;
    private String data;
    private String hora;
    private String status;

    public Agendamento() {
    }

    public Agendamento(Long id_criador, Long id_medico, Long id_paciente, String data, String hora, String status) {
        this.id_criador = id_criador;
        this.id_medico = id_medico;
        this.id_paciente = id_paciente;
        this.data = data;
        this.hora = hora;
        this.status = status;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_criador() {
        return id_criador;
    }

    public void setId_criador(Long id_criador) {
        this.id_criador = id_criador;
    }

    public Long getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(Long id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Long getId_medico() {
        return id_medico;
    }

    public void setId_medico(Long id_medico) {
        this.id_medico = id_medico;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
