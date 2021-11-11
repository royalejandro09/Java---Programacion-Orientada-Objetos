package com.company;

public class FechaInvalidaException extends Exception{

    public FechaInvalidaException(){
        super();
    }

    public FechaInvalidaException(String message){
        super(message);
    }
}
