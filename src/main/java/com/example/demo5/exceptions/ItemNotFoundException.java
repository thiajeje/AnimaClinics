package com.example.demo5.exceptions;

public class ItemNotFoundException extends RuntimeException{
    public ItemNotFoundException(){
        super();
    }

    public ItemNotFoundException(String msg){
        super(msg);
    }
}

