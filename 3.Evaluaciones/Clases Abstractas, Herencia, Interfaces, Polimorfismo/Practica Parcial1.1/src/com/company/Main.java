package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //INSTANCIANDO LOS OBJETOS

        PacienteObraSocial Roy = new PacienteObraSocial(new Consulta((new Date(120,11,5)),"IngenieroCivil",10.00),(new Date(110,6,9)),"Roy", "Martinez",2,"ABCD",2);
        PacienteObraSocial Richard = new PacienteObraSocial(new Consulta((new Date(120,11,5)),"IngenieroCivil",10.00),(new Date(110,6,9)),"Roy", "Martinez",2,"ABCD",1);

        PacienteParticular RAMV = new PacienteParticular(new Consulta((new Date(120,11,5)),"IngenieroCivil",10.00),(new Date(110,6,9)),"Roy", "Martinez",1,1000.0,123456);

        //Ejecutando los metodos

        System.out.println(Richard.compareTo(Roy));

        System.out.println(RAMV.getPrecioConsulta());
        System.out.println(RAMV.evaluacionInicial());

    }

}
