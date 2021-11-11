package com.company;

import java.util.ArrayList;
import java.util.List;

public class ServicioCombo extends Servicio {

    private Double descuento;
    private List<Servicio> servicios;

    public ServicioCombo(String nombre, String descripcion, Double descuento) {
        super(nombre, descripcion);
        this.descuento = descuento;
        servicios = new ArrayList<>();
    }

    public void agregarServicio(Servicio servicio){
        servicios.add(servicio);
    }

    @Override
    public Double calcularPrecio() {
       Double precioTotal = 0.0;
        for (Servicio servicio : servicios) {
            precioTotal += servicio.calcularPrecio() - (servicio.calcularPrecio() * descuento);
        }
        return precioTotal;
    }
}
