package com.company;

public abstract class Producto {

    private Double peso;

    public Producto(){

    }
    public Producto(Double peso) {
        this.peso = peso;
    }

    public abstract double clacularEspacio();
}
