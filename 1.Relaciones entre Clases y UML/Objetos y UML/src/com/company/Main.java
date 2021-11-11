package com.company;

public class Main {

    public static void main(String[] args) {

	// write your code here

    //Instanciando el objeto jugador

    UsuarioJuego jugador = new UsuarioJuego("Roy", "123456");

     //Probando la funcionalidad del objeto

        //Imprimimos el nombre por consola
        System.out.println(jugador.getNombre());

        //Ejecutamos el metodo aumentar Puntaje que me sumara 1 a mi puntaje actual y el metodo subir nivel que hara lo mismo aumentar en 1
        jugador.aumentarPuntaje();
        jugador.subirNivel();

        //Obtenemos el puntaje y nivel por consola debe ser = 1
        System.out.println(jugador.getPuntaje());
        System.out.println(jugador.getNivel());

        //Ejecutando el metodo bonus quien me aumentara en 500 el puntaje dandome por consola =501.0
        jugador.bounus(500);
        System.out.println(jugador.getPuntaje());

        //Muestra mi clave actual digitada en el constructor
        System.out.println(jugador.getClave());

        // Me modifica mi clave actual y me muestra por consola la nueva clave
        jugador.setClave("987654");
        System.out.println(jugador.getClave());




    }
}
