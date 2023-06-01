package com.example.demo5.exceptions;

public class AnamneseNotFoundException extends RuntimeException{
    public AnamneseNotFoundException(){
        super();
    }

    public AnamneseNotFoundException(String msg){
        super(msg);
    }
}
