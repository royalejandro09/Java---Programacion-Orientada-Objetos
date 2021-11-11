package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        //Instanciando el Puerto
        Puerto argentina = new Puerto("puerto1");

        //Instanciando contenedores
        Contenedor azul = new Contenedor(001, "Colombia", true);
        Contenedor rojo = new Contenedor(002, "Desconocido", true);
        Contenedor verde = new Contenedor(003, "Ecuador", false);

        //**********Agregando Contenedores al Puerto*************//
        argentina.addContenedor(new Contenedor(004, "Brazil", false));
        argentina.addContenedor(new Contenedor(005, "Desconocido", true));
        argentina.addContenedor(azul);
        argentina.addContenedor(rojo);
        argentina.addContenedor(verde);

        //Aplicando los metodos
        System.out.println(argentina.cantidadContenedores());
        System.out.println(argentina.getCantidadContenedoresPeligrososProcedenciaDesconocida());

        argentina.mostrarContenedores();
    }
}
