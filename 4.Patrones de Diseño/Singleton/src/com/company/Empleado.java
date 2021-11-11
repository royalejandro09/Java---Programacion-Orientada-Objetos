package com.company;

public abstract class Empleado {

    private String nombre;
    private int legajo;

    public Empleado(){

    }

    public Empleado(String nombre, int legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public abstract Double calcularSueldo(int dias);
}
