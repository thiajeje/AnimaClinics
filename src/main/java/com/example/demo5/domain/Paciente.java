package com.example.demo5.domain;

import javax.persistence.*;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY )
    private Long id;
    private String nome;
    private String cpf;
    private String data_nascimento;
    private String endereco;
    private String cep;
    private String email;
    private String telefone;
    private String convenio;
    private String sexo;
    private String foto;


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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String curso) {
        this.data_nascimento = curso;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) { this.sexo = sexo;}

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

}

