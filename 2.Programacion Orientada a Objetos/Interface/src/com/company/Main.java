package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Tanque tanqueMilitar = new Tanque();
        tanqueMilitar.mostrar();
        tanqueMilitar.atacar();
        System.out.println("Aumentando la energia del Tanque a " + tanqueMilitar.aumentoEnergia(5000));

        RobotLiviano robotL1 = new RobotLiviano();
        robotL1.mostrar();
        robotL1.volar();

    }
}
