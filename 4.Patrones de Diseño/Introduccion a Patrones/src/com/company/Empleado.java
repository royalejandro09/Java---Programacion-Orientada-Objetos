package com.company;

public abstract class Empleado {

    /********************   Atributos   **********************/

    private String nombre;
    private Integer legajo;

    /************ Constructor vacio y con atributos **********/
    public Empleado() {

    }

    public Empleado(String nombre, Integer legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    /**************** Metodos *************************/
    public abstract Double calcularSueldo(int dias);
}
