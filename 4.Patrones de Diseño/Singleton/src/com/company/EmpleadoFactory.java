package com.company;

public class EmpleadoFactory {

    public static final String CODIGO_EMPLEADO_RD = "EMP-INT";
    public static final String CODIGO_EMPLEADO_CONTRATADO = "EMP-EXT";

    private static EmpleadoFactory instance;

    private EmpleadoFactory() {
    }

    public static EmpleadoFactory getInstance(){
        if(instance == null){
            instance = new EmpleadoFactory();
        }
        return instance;
    }

    public static Empleado crearEmpleado(String codigo){
        switch (codigo) {
            case CODIGO_EMPLEADO_RD:
                return new EmpleadoRelacionDependencia("Swagger", 123, 1000.0);
            case CODIGO_EMPLEADO_CONTRATADO:
                return new EmpleadoContratado("fvc",4566, 7.0,0.14);
            default:
                return null;

        }
    }
}
