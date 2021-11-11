package com.company;

public class RobotLiviano extends SistemaArmas implements Volador, Atacante, Defensor {

    public RobotLiviano() {
        super(500);
    }


    @Override
    public void mostrar() {
        System.out.println("Robot Liviano tiene: " + getEnergia() + " de energía");
    }

    @Override
    public void volar() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }
}
