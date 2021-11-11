package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

        Barco miBarco = new Barco();

        miBarco.agregarCarga(CargaFactory.COD_TV);
        miBarco.agregarCarga(CargaFactory.COD_MEDICINE);
        miBarco.agregarCarga("NUEVOCODIGO");
        miBarco.agregarCarga(CargaFactory.COD_CONTENEDOR);

        miBarco.mostrarInforme();
    }
}
