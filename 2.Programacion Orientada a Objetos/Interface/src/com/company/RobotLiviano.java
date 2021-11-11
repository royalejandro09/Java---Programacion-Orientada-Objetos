package com.company;

import com.company.Interfaces.Atacante;
import com.company.Interfaces.Defensor;
import com.company.Interfaces.Volador;

public class RobotLiviano extends SistemaArmas implements Atacante, Defensor, Volador {

    //Constructor
    public RobotLiviano() {
        super(500);
    }

    //SobreEscribiendo los metodos de la clase padre
    @Override
    public void mostrar() {
        System.out.println("Robot Liviano tiene: " + getEnergia() + " de energia");
    }

    //SobreEscribiendo los metodos de las Interfaces
    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void volar() {
        System.out.println("Estoy Volando");
    }
}
