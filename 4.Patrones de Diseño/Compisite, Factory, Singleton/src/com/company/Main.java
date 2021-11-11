package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        EmpresaDeServicio empresa = new EmpresaDeServicio();

        empresa.agregarServicio(ServicioFactory.COD_SERVICIO_SIMPLE_);
        empresa.agregarServicio(ServicioFactory.COD_SERVICIO_SIMPLE_INST);
        empresa.agregarServicio("ServicioCodigo");
        empresa.agregarServicio(ServicioFactory.COD_COMBO_SERVICIO);


        empresa.mostrarServicios();
    }
}
