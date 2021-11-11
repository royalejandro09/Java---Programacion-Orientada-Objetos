package com.company;

public class Señuelo extends SistemaArmas {

    public Señuelo() {
        super(300);
    }


    @Override
    public void mostrar() {
        System.out.println("Señuelo tiene: " + getEnergia() + " de energía");
    }
}