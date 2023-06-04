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
    private String data;
    private String hora;

    public Agendamento() {
    }

    public Agendamento(Long id_criador, Long id_medico, String data, String hora) {
        this.id_criador = id_criador;
        this.id_medico = id_medico;
        this.data = data;
        this.hora = hora;
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
}
