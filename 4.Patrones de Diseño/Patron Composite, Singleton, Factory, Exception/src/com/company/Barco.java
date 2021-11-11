package com.company;

import java.util.ArrayList;
import java.util.List;

public class Barco {

    private List<Carga> cargas;

    public Barco(){
        cargas = new ArrayList<>();
    }

    public void agregarCarga(String cod) {
        try {
            cargas.add(CargaFactory.getInstance().generarCarga(cod));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void mostrarInforme() {
        for (Carga carga : cargas) {
            System.out.println("Nombre: "+ carga.getNombre() + " peso: " + carga.calcularPeso()+" kg");
        }
    }
}
