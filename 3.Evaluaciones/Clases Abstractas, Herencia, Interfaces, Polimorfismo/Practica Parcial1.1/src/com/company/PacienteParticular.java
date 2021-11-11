package com.company;

import java.util.Date;

public class PacienteParticular extends Paciente {


    //Atributos

    private Double precioConsulta;
    private Integer dni;


    //Constructor

    public PacienteParticular(Consulta consulta, Date fechaNacimiento, String nombre, String apellido, int consultaNumero, Double precioConsulta, Integer dni) {
        super(consulta, fechaNacimiento, nombre, apellido, consultaNumero);
        this.precioConsulta = precioConsulta;
        this.dni = dni;
    }

    //Metodo Get para acceder al etributo

    public Double getPrecioConsulta(){
        return precioConsulta;
    }
}
