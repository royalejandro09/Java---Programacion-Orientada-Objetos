package com.company;

import com.company.Interfaces.Atacante;
import com.company.Interfaces.Defensor;
import com.company.Interfaces.Volador;

public class RobotPesado extends SistemaArmas implements Volador, Atacante, Defensor {

    //Constructor inicializando el atributo energia en 1000 para RobotPesado
    public RobotPesado() {
        super(1000);
    }


    //Sobreescribiendo el metodo heredado por la clase padre
    @Override
    public void mostrar() {
        System.out.println("Robot Pesado tiene: " + getEnergia() + " de energia");
    }

    //Sobre escribiendo los metodos de las interfaces
    @Override
    public void atacar() {

    }

    @Override
    public void defender() {

    }

    @Override
    public void volar() {
    }


}
