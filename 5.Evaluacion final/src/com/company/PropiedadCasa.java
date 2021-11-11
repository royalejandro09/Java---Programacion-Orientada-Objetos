package com.company;

public class PropiedadCasa extends Propiedad {


    private Double montoBaseImpuesto;

    public PropiedadCasa(String calle, int numero, Double montoBaseImpuesto) {
        super(calle, numero);
        this.montoBaseImpuesto = montoBaseImpuesto;
    }

    @Override
    public Double calcularImpuesto() {
        if (getCalle().equals("Av. San Martin")) {
            montoBaseImpuesto = montoBaseImpuesto * 1.1;
        }
        return montoBaseImpuesto;
    }
}
