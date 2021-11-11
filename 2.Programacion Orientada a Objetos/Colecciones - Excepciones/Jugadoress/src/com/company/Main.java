package com.company;

public class Main {

    public static void main(String[] args) {

        Equipo equipo = new Equipo("Sacachispas");

        equipo.agregarJugador(new Jugador("Colmanares","ARQUERO",1));
        equipo.agregarJugador(new Jugador("David","DEFENSOR",2));
        equipo.agregarJugador(new Jugador("David","DEFENSOR",2));
        equipo.agregarJugador(new Jugador("David","DEFENSOR",2));
        equipo.agregarJugador(new Jugador("David","DEFENSOR",2));
        equipo.agregarJugador(new Jugador("Pladino","MEDIOCAMPISTA",5));
        equipo.agregarJugador(new Jugador("Pladino","MEDIOCAMPISTA",5));
        equipo.agregarJugador(new Jugador("Pladino","MEDIOCAMPISTA",5));
        equipo.agregarJugador(new Jugador("Pladino","MEDIOCAMPISTA",5));
        equipo.agregarJugador(new Jugador("Pladino","MEDIOCAMPISTA",5));
        equipo.agregarJugador(new Jugador("Pladino","MEDIOCAMPISTA",5));
        equipo.agregarJugador(new Jugador("Coronel","DELANTERO",10));
        equipo.agregarJugador(new Jugador("Coronel","DELANTERO",10));


        try {
            System.out.println(equipo.cantidadJugadores("MEDIO"));
        } catch (EquipoException e) {
            e.printStackTrace();
        }





    }
}
