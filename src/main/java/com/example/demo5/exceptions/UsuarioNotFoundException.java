package com.example.demo5.exceptions;

public class UsuarioNotFoundException extends RuntimeException{
    public UsuarioNotFoundException(){
        super();
    }

    public UsuarioNotFoundException(String msg){
        super(msg);
    }
}
