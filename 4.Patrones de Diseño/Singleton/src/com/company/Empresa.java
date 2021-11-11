package com.company;

import java.util.ArrayList;

public class Empresa {

    private String razonSocial;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial) {
        this.razonSocial = razonSocial;
        empleados = new ArrayList<>();

        EmpleadoRelacionDependencia empRd1 = (EmpleadoRelacionDependencia) EmpleadoFactory.getInstance().crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_RD);
        EmpleadoContratado empC1 = (EmpleadoContratado) EmpleadoFactory.getInstance().crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_CONTRATADO);

        empleados.add(empRd1);
        empleados.add(empC1);
    }

    public Double calcularSueldos(int dias) {
        Double totalSueldos = 0.0;
        for (Empleado empleado : empleados) {
            totalSueldos += empleado.calcularSueldo(dias);
        }
        return totalSueldos;
    }

}
