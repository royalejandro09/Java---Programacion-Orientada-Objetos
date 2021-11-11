package com.company;

import java.util.ArrayList;
import java.util.List;

public class PropiedadBarrioCerrado extends Propiedad {

    private List<Propiedad> propiedades;
    private int factorMultiplicador;

    public PropiedadBarrioCerrado(String calle, int numero, int factorMultiplicador) {
        super(calle, numero);
        this.factorMultiplicador = factorMultiplicador;
        propiedades = new ArrayList<>();
    }

    public void addPropiedad(Propiedad propiedad) {
        propiedades.add(propiedad);
    }

    @Override
    public Double calcularImpuesto() {
        Double sumatoriaImpuesto = 0.0;
        for (Propiedad propiedad : propiedades) {
            sumatoriaImpuesto += propiedad.calcularImpuesto() * factorMultiplicador;
        }
        return sumatoriaImpuesto;
    }
}
