package com.example.demo5.exceptions;

public class PedidoNotFoundException extends RuntimeException{
    public PedidoNotFoundException(){
        super();
    }

    public PedidoNotFoundException(String msg){
        super(msg);
    }
}
