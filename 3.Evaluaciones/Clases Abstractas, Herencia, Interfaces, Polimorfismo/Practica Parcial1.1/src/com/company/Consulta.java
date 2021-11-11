package com.company;

import java.util.Date;

public class Consulta {

    //Atributos
    private Date fechaConsulta;
    private String especialidad;
    private Double horaMinutoConsulta;

    //Constructor

    public Consulta(Date fechaConsulta, String especialidad, Double horaMinutoConsulta) {
        this.fechaConsulta = fechaConsulta;
        this.especialidad = especialidad;
        this.horaMinutoConsulta = horaMinutoConsulta;
    }
}
