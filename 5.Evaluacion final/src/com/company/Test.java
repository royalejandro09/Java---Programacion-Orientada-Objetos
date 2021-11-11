package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

        Municipio NorteDeSantander = new Municipio();

        NorteDeSantander.agregarPropiedad(PropiedadFactory.COD_CASA_1);
        NorteDeSantander.agregarPropiedad(PropiedadFactory.COD_CASA_2);
        NorteDeSantander.agregarPropiedad(PropiedadFactory.BARRIO_CERRADO);
        NorteDeSantander.agregarPropiedad("cODIGOeRRONEO");

        NorteDeSantander.mostrarPropiedades();
    }
}
