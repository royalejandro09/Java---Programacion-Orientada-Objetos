package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        /*** Creando una instancia de Empleado Factory *******/
        /*** EmpleadoFactory.getInstance; ***/
        EmpleadoFactory empleadoFactory1 = EmpleadoFactory.getInstance(); // Entrando a la clase i ejecutando el metodo getInstance
        //Quein me retornara la instancia creada una sola vez

        // Instancio un Empleado<Abstract> dependiendo el codigo que le pase como parametro
        Empleado empleadoX = empleadoFactory1.crearEmpleado(EmpleadoFactory.CODIGO_EMPLEADO_RD);

        System.out.println(empleadoX);
    }
}
