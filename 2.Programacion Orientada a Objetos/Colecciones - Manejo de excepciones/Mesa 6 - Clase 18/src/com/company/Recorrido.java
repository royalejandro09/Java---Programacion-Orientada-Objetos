package com.company;

import java.util.ArrayList;
import java.util.List;

public class Recorrido {
    private String estacionDestino;
    private String estacionPartida;

    public Recorrido(String estacionDestino, String estacionPartida) {
        this.estacionDestino = estacionDestino;
        this.estacionPartida = estacionPartida;
    }

    public String getEstacionDestino() {
        return estacionDestino;
    }

    public String getEstacionPartida() {
        return estacionPartida;
    }

}
