package com.company;

public class Tanque extends SistemaArmas implements Atacante, Defensor {

    public Tanque() {
        super(5000);
    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void mostrar() {
        System.out.println("Tanque tiene: " + getEnergia() + " de energía");
    }
}
