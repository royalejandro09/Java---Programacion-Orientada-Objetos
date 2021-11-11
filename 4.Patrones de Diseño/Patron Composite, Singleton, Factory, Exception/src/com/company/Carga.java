package com.company;

public abstract class Carga {

    private String nombre;
    private String descripcion;

    public Carga(String nombre) {
        this.nombre = nombre;

    }

    public abstract Double calcularPeso();

    public String getNombre() {
        return nombre;
    }

}
