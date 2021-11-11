package com.company;

import com.company.Interfaces.Volador;

public class Señuelo extends SistemaArmas implements Volador {

    //Constructor
    public Señuelo() {
        super(300);
    }

    //SobreEscribiendo el metodo de la clase padre
    @Override
    public void mostrar() {
        System.out.println("Señeulo tiene: " + getEnergia() + " de energia");
    }

    //SobreEscribiendo los metodos de las Interfaces
    @Override
    public void volar() {

    }
}
