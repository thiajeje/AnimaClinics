package com.example.demo5.exceptions;

public class PacienteNotFoundException extends RuntimeException{
    public PacienteNotFoundException(){
        super();
    }

    public PacienteNotFoundException(String msg){
        super(msg);
    }
}
