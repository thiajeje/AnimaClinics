package com.example.demo5.domain;

import javax.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY )
    private Long id;
    private String nome;
    private String cpf;
    private String telefone;
    private String curso;
    private String ra;
    private String endereco;
    private String cep;
    private String email;
    private String profissao;
    private String codigo_conselho;

    @Transient
    private Integer idade;

    //sets e gets

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
    	return nome;
    }
    
    public void setNome(String nome) {
    	this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    public String getCodigo_conselho() {
        return codigo_conselho;
    }

    public void setCodigo_conselho(String codigo_conselho) {
        this.codigo_conselho = codigo_conselho;
    }
}

