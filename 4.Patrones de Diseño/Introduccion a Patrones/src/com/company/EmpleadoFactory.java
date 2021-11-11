package com.company;

public class EmpleadoFactory {

    //Constantes
    public static final String CODIGO_EMPLEADO_RD = "EMP-INT";
    public static final String CODIGO_EMPLEADO_C = "EMP-EXT";

    /*********************************************** PATRON SINGLETON **************************************/
    /********** Atributo estatico ********/
    private static EmpleadoFactory instance;

    /*********** Constructor *********/
    private EmpleadoFactory() {  //Colocando mi constructor privado evito que me puedan instanciar objetos
    }

    /********** Metodo Get Instance Estatico ***********/

    public static EmpleadoFactory getInstance() {
        if (instance == null) {
            instance = new EmpleadoFactory();   //Instanciamos mi Empleado Factory en una condicion la cual solo me dejara instanciarlo una sola vez y si
        }                                       // Ya esta instanciado me retorna esa instancia
        return instance;
    }

    /******************************************* PATRON FACTORY **************************************/

    /**** Metodo de la clase ***/
    public Empleado crearEmpleado(String codigoEmpleado) { //Devuele un dato de Tipo Empleado sea Contratado/RelacionDependencia
        //Este empleado hace referencia a la clase Abstracta
        switch (codigoEmpleado) {
            case CODIGO_EMPLEADO_RD:
                return new EmpleadoRelacionDependencia(1000.0);
            case CODIGO_EMPLEADO_C:
                return new EmpleadoContratado(7.0, 14.0);
            default:
                return null;
        }

    }


}
