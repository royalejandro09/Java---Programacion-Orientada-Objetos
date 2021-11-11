package com.company;

public class EmpleadoContratado extends Empleado {

    private Double importePorHora;
    private Double retencionImpuesto;

    public EmpleadoContratado(String nombre, int legajo, Double importePorHora, Double retencionImpuesto) {
        super(nombre, legajo);
        this.importePorHora = importePorHora;
        this.retencionImpuesto = retencionImpuesto;
    }

    @Override
    public Double calcularSueldo(int dias) {
        Double sueldo = 0.0;
        return sueldo = (dias * 8)*importePorHora - ( ((dias *8)*importePorHora)*retencionImpuesto);
    }
}

