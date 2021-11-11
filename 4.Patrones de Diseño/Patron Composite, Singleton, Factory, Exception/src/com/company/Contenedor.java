package com.company;

import java.util.ArrayList;
import java.util.List;

public class Contenedor extends Carga {

    private Double pesoContenedor;
    private List<Carga> cargas;

    public Contenedor(String nombre, Double pesoContenedor) {
        super(nombre);
        this.pesoContenedor = pesoContenedor;
        cargas = new ArrayList<>();
    }

    public void addCarga(Carga carga) {
        cargas.add(carga);
    }

    @Override
    public Double calcularPeso() {
        for (Carga carga : cargas) {
            pesoContenedor += carga.calcularPeso();
        }
        return pesoContenedor;
    }

}
