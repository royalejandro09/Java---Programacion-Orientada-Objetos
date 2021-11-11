package com.company;

public class Jugador {

    private String apellido;
    private String posicion;
    private Integer numeroCamiseta;

    public Jugador(String apellido, String posicion, Integer numeroCamiseta) {
        this.apellido = apellido;
        this.posicion = posicion;
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public Integer getNumeroCamiseta() {
        return numeroCamiseta;
    }
}
