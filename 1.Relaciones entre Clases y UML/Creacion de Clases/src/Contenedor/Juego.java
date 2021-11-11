package Contenedor;
import java.util.Scanner;

public class Juego {

    public static void main (String[] args){

        Scanner nombre = new Scanner(System.in);
        System.out.println("Ingrese el nombre del jugador 1 y jugador 2");
        String nombreJugador1 = nombre.nextLine();
        String nombreJugador2 = nombre.nextLine();


        resultado(nombreJugador1, nombreJugador2);



    }


    //DESAFIO PIEDRA PAPEL O TIJERA



    public static void resultado(String nombreJugador1, String nombreJugador2){

        Scanner eleccion = new Scanner(System.in);
        System.out.println("Ingrese su eleccion Piedra[1] Papel[2] o Tijera[3]");
        String eleccionJugador1 = eleccion.nextLine();
        String eleccionJugador2 = eleccion.nextLine();

        int puntosJugador1 = 0;

        int puntosJugador2 = 0;

        while(puntosJugador2<2 && puntosJugador1<2) {
            if ((eleccionJugador1.equals("*")) || (eleccionJugador2.equals("*"))) {
                System.out.println("Ha finalizado el juego ");

            }
            if (eleccionJugador1.equals(eleccionJugador2)) {
                System.out.println("Esto es un empate de partida");
                return;

            } else if ((eleccionJugador1.equals("1") && eleccionJugador2.equals("3")) || (eleccionJugador1.equals("2") && eleccionJugador2.equals("1")) || (eleccionJugador1.equals("3") && eleccionJugador2.equals("2"))) {
                puntosJugador1 += 1;
                System.out.println("Ganador de la partida el jugador: " + nombreJugador1);

            } else {
                puntosJugador2 += 1;
                System.out.println("Ganador de la partida el jugador: " + nombreJugador2);

            }
        }
        System.out.println(puntosJugador1 + "+" + puntosJugador2);
    }

}

