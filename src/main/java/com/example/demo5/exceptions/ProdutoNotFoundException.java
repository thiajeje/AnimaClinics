package com.example.demo5.exceptions;

public class ProdutoNotFoundException extends RuntimeException{
    public ProdutoNotFoundException(){
        super();
    }

    public ProdutoNotFoundException(String msg){
        super(msg);
    }
}
