package com.company;

public class EmpleadoContratado extends Empleado {

    /**************** Atributos ****************/
    private Double importeXhora;
    private Double retencionImpuestp;

    /************** Constructor ***************/
    public EmpleadoContratado() {

    }

    public EmpleadoContratado(String nombre, Integer legajo) {
        super(nombre, legajo);
    }

    public EmpleadoContratado(Double importeXhora, Double retencionImpuestp) {
        this.importeXhora = importeXhora;
        this.retencionImpuestp = retencionImpuestp;
    }

    /******************* METODOS **************/
    @Override
    public Double calcularSueldo(int dias) {
        return null;
    }

    /***** Creando el ToString ***/
    @Override
    public String toString() {
        return "EmpleadoContratado{" +
                "importeXhora=" + importeXhora +
                ", retencionImpuestp=" + retencionImpuestp +
                '}';
    }
}
