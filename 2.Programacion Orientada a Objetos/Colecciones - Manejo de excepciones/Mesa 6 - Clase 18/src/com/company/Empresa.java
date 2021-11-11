package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa  {

    private String nombre;
    private List<Reserva> reserva;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.reserva = new ArrayList<>();

    }

    public List<String> estacionesValidas() {
        List<String> estacionesValidas = new ArrayList<>();
        estacionesValidas.add("Buenos Aires");
        estacionesValidas.add("Lujan");
        estacionesValidas.add("Mercedes");
        estacionesValidas.add("Suipacha");
        estacionesValidas.add("Chivilcoy");
        estacionesValidas.add("Alberti");
        estacionesValidas.add("Bragado");

        return estacionesValidas;
    }

    public void agregarReserva(Reserva reserva) {
        this.reserva.add(reserva);
    }

    public Double recaudacionTotal() {
        Double recaudacion = 0.0;
        for (Reserva reserva1 : reserva) {
           recaudacion += reserva1.calcularReserva();

        }
        return recaudacion;
    }

    public Integer cantVecesRecorrida(String estacion) throws EmpresaException {
        if (estacionesValidas().contains(estacion)) {
            Integer cantidadPersonas = 0;
            for (Reserva reserva1 : reserva) {
            if(reserva1.getRecorrido().getEstacionDestino().equals(estacion) || reserva1.getRecorrido().getEstacionPartida().equals(estacion)) {
                cantidadPersonas += reserva1.getCantidadPersonas();
                }
            }
            return cantidadPersonas;
        } else {
            throw new EmpresaException("Estación inválida");

        }
    }
}
