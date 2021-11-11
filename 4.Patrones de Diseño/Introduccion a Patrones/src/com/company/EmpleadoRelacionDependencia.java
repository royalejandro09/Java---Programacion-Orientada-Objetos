package com.company;

public class EmpleadoRelacionDependencia extends Empleado {

    /*************** Atributos *************/
    private Double sueldoMensual;

    /************** Constructor ***********/
    public EmpleadoRelacionDependencia(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    public EmpleadoRelacionDependencia(String nombre, Integer legajo) {
        super(nombre, legajo);
    }


    /******************  Metodos **********/
    @Override
    public Double calcularSueldo(int dias) {
        return null;
    }

    /*** Creando el ToString ***/
    @Override
    public String toString() {
        return "EmpleadoRelacionDependencia {" +
                " sueldoMensual= " + sueldoMensual +
                '}';
    }
}
