package com.company;

public class EmpleadoRelacionDependencia extends Empleado{

    private Double sueldoMensual;


    public EmpleadoRelacionDependencia(String nombre, int legajo, Double sueldoMensual) {
        super(nombre, legajo);
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo(int dias) {

        return  dias * (sueldoMensual/30);
    }
}
