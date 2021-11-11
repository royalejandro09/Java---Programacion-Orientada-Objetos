package com.company;

import com.company.Interfaces.Atacante;
import com.company.Interfaces.Defensor;

public class Tanque extends SistemaArmas implements Atacante, Defensor {

    //Constructor
    public Tanque() {
        super(5000);
    }

    //Metodo propio del Tanque
    public Integer aumentoEnergia(Integer aumentar) {
         return   getEnergia() + aumentar;
    }

    //SobreEscribiendo metodos de la clase padre
    @Override
    public void mostrar() {
        System.out.println("Tanque tiene: " + getEnergia() + " de energia");
    }

    //SobreEscribiendo los metodos de las Interfaces
    @Override
    public void atacar() {
        System.out.println("Estoy Atacando");
    }

    @Override
    public void defender() {

    }
}
