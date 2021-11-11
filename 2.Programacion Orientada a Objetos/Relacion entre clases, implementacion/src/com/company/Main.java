package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Chofer chofer1, chofer;
        chofer1 = new Chofer("Roy", "Martinez", new Auto("RM", "Mustang", "2021"));

        Auto auto1 = new Auto("RAMV", "VolskWagen", "2022");
        chofer = new Chofer("Richard", "Martinez", auto1);

        System.out.println("Patente auto asignado; " + auto1.getMarca());
        System.out.println("Marca del auto asignado; " + chofer1.verMarca());


    }
}
