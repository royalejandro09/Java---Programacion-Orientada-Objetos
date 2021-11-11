package com.company;

public class Cliente {

    private Integer numeroCliente;
    private String apellido;
    private Integer dni;

    public Cliente(Integer numeroCliente, String apellido, Integer dni) {
        this.numeroCliente = numeroCliente;
        this.apellido = apellido;
        this.dni = dni;
    }

    public Cliente() {
    }
}
