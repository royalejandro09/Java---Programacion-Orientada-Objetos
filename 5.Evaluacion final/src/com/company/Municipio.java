package com.company;

import java.util.ArrayList;
import java.util.List;

public class Municipio {

    private List<Propiedad> propiedades;

    public Municipio() {
        propiedades = new ArrayList<>();
    }

    public void agregarPropiedad(String cod) {
        try {
            propiedades.add(PropiedadFactory.getInstance().generarPropiedad(cod));
        } catch (PropiedadFactoryException e) {
            e.printStackTrace();
            System.out.println(cod + " No es un codigo Valido");
        }
    }

    public void mostrarPropiedades() {
        for (Propiedad propiedad : propiedades) {
            System.out.println("La calle: " + propiedad.getCalle() + " Numero: " + propiedad.getNumero() + " El impuesto a pagar es: " + propiedad.calcularImpuesto());
        }
    }
}
