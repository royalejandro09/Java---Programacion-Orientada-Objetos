package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    Perro perro1 = new Perro("tomy", 5.0, "snwzer",true, false, 2000  );
    Perro perro2 = new Perro("petunia", 3.0, "caniche", 2010);


    //Ejecutando los metodos del Perro 1
        System.out.println(perro1.informarEdad(2005));
        perro1.sePuedePerder();
        perro1.ladrar();

        //Ejecutando los metodos del Perro 2
        System.out.println(perro2.informarEdad(2015));
        perro2.sePuedePerder();
        perro2.ladrar();

    }
}
