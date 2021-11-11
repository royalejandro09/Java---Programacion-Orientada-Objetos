package com.company;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private List<Jugador> jugadores;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

    public void agregarJugador(Jugador jugador){
        jugadores.add(jugador);
    }

    public Jugador buscarJugador(Integer numeroDeJugador) throws EquipoException {
        Jugador jugadorBuscado = null;


        for (Jugador jugador : jugadores) {
            if (jugador.getNumeroCamiseta().equals(numeroDeJugador)){
                jugadorBuscado = jugador;
                break;
            }
        }
        if(jugadorBuscado != null){
            return jugadorBuscado;
        }else {
            throw new EquipoException("no existe el jugador con ese numero");
        }
    }

    public Integer cantidadJugadores(String posicion) throws EquipoException {

        if(!(posicionesValidas().contains(posicion))){
            throw new EquipoException(posicion + " no es una posicion valida");
        }

        Integer jugadoresEnPosicion = 0;

        for (Jugador jugador : jugadores) {
            if(jugador.getPosicion().equals(posicion)){
                jugadoresEnPosicion++;
            }
        }

        return jugadoresEnPosicion;
    }

    public List<Jugador> obtenerReservas(){

        List<Jugador> reserva = new ArrayList<>();

        for (int i = 17; i < jugadores.size(); i++) {
            reserva.add(jugadores.get(i));
        }



        return reserva;
    }





    private List<String> posicionesValidas(){
        List<String> posicionesValidas = new ArrayList<>();
        posicionesValidas.add("DELANTERO");
        posicionesValidas.add("ARQUERO");
        posicionesValidas.add("MEDIOCAMPISTA");
        posicionesValidas.add("DEFENSOR");
        posicionesValidas.add("AGUATERO");
        return posicionesValidas;
    }
}
