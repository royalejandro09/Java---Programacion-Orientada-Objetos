package com.company;

import java.util.Date;

public abstract class Paciente {

    //Atributos
    private Consulta consulta;
    private Date fechaNacimiento;
    private String nombre;
    private String apellido;
    private int consultaNumero;


    //Constructor

    public Paciente(Consulta consulta, Date fechaNacimiento, String nombre, String apellido, int consultaNumero) {
        this.consulta = consulta;
        this.fechaNacimiento = fechaNacimiento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.consultaNumero = consultaNumero;
    }

    //Metodo de la clase padre

    public String evaluacionInicial() {
        String rta;
        if (this.consultaNumero == 1) {
            rta = "Se debe realizar la evaluacion";
        } else {
            rta = "No se debe realizar la evaluacion";
        }
        return rta;
    }
}
