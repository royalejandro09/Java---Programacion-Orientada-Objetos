package com.company;

public class CargaSimple extends Carga {

    private Double pesoCarga;
    private Boolean refrigerado;

    public CargaSimple(String nombre, Double pesoCarga, Boolean refrigerado) {
        super(nombre);
        this.pesoCarga = pesoCarga;
        this.refrigerado = refrigerado;
    }

    @Override
    public Double calcularPeso() {
        if (refrigerado) {
            pesoCarga = pesoCarga * 1.10;
        }
        return pesoCarga;
    }


}
