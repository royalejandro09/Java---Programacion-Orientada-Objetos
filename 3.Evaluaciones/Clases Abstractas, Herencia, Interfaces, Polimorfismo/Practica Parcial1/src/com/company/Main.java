package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Instanciando los Objetos de alumnos y examenes

        ExamenParcial roy1=new ExamenParcial(new Alumno("Roy", "Martinez",123),"java","xxx",3.9,5);

        ExamenFinal roy=new ExamenFinal(new Alumno("Roy", "Martinez",123),"java","xxx",8.0,5.0,"ninguna");
        ExamenFinal richard=new ExamenFinal(new Alumno("Richard", "Martinez",123),"java","xxx",5.0,8.0, "ninguna");


        System.out.println(roy1.reintentos());

        System.out.println(roy.consultaExamen());
        System.out.println(richard.consultaExamen());

        System.out.println(roy.compareTo(richard));
    }
}
