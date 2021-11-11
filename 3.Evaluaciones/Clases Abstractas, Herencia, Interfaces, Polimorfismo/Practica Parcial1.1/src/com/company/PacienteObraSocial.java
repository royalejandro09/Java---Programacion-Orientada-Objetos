package com.company;

import java.util.Date;

public class PacienteObraSocial extends Paciente implements Comparable {

    //Atributos

    private String nombreObraSocial;
    private Integer numeroAsociado;


    //Constructor

    public PacienteObraSocial(Consulta consulta, Date fechaNacimiento, String nombre, String apellido, int consultaNumero, String nombreObraSocial, Integer numeroAsociado) {
        super(consulta, fechaNacimiento, nombre, apellido, consultaNumero);
        this.nombreObraSocial = nombreObraSocial;
        this.numeroAsociado = numeroAsociado;
    }


    //Implementando el metodo Comparable de Java

    @Override
    public int compareTo(Object obj) {
        PacienteObraSocial pacienteX = (PacienteObraSocial) obj;

        return this.numeroAsociado - pacienteX.numeroAsociado;

    }
}
