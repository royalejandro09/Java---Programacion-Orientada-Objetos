package com.company;

public class RobotPesado extends SistemaArmas implements Volador, Atacante, Defensor {

    public RobotPesado() {
        super(1000);
    }


    @Override
    public void mostrar() {
        System.out.println("Robot Pesado tiene: " + getEnergia() + " de energía");

    }

    @Override
    public void volar() {
        setEnergia(getEnergia() - 100);
    }

    @Override
    public void atacar() {
        System.out.println("Robot Pesado está atacando");
    }

    @Override
    public void defender() {
        System.out.println("Robot Pesado se está defendiendo");
    }
}
