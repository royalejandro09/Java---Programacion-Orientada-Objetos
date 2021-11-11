package com.company;

import java.time.chrono.ChronoLocalDate;
import java.util.Date;

public class Paciente {

    //ATRIBUTOS

    private String nombre;
    private String apellido;
    private Date fechaDeInternacion;
    private Date fechaDeAlta;

    //CONSTRUCTOR


    public Paciente(String nombre, String apellido, Date fechaDeInternacion) throws FechaInvalidaException {

        //Creando la fecha actual
        Date today = new Date();
        //Creando la Excepcion message
        if (today.before(fechaDeInternacion)) {
            throw new FechaInvalidaException("Error: La fecha de internacion debe ser anterior al dia Actual");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeInternacion = fechaDeInternacion;
        this.fechaDeAlta = null;
        if (fechaDeInternacion.before(today)) {
            this.fechaDeInternacion = fechaDeInternacion;
        }
    }



    //METODOS

    public void darDeAlta(Date fechaDeAlta) throws FechaInvalidaException {
        if (fechaDeAlta.after(fechaDeInternacion)) {
            System.out.println("Ok");
        } else {
            throw new FechaInvalidaException("Error: Fecha de alta no puede ser anterior a la fecha de Internacion");
        }
    }
}
