package com.company;

public class Reserva {
    private Integer codigo;
    private Recorrido recorrido;
    private Integer cantidadPersonas;

    public Reserva(Integer codigo, Recorrido recorrido, Integer cantidadPersonas) {
        this.codigo = codigo;
        this.recorrido = recorrido;
        this.cantidadPersonas = cantidadPersonas;
    }

    public Double calcularReserva() {
        Double precioReserva = cantidadPersonas * 50.0;
        Double porcentajeDescuento = 0.0;
        if (recorrido.getEstacionPartida().equals("Buenos Aires") && recorrido.getEstacionDestino().equals("Bragado")) {
            porcentajeDescuento = 20.0;
        } else if (recorrido.getEstacionDestino().equals("Buenos Aires") && recorrido.getEstacionPartida().equals("Bragado")) {
            porcentajeDescuento = 20.0;
        }
        return precioReserva - (precioReserva * porcentajeDescuento) / 100;
    }

    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }

    public Recorrido getRecorrido() {
        return recorrido;
    }
}
