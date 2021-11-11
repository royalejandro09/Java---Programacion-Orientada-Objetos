package Contenedor;

import java.util.Scanner;

public class Clase3 {

    public static void main(String[] args) {

        //  EJECUTABLE

        Scanner nombre = new Scanner(System.in);
        System.out.println("Introduzca el nombre de los jugadores");

        String nombreJugador1 = nombre.nextLine();
        String nombreJugador2 = nombre.nextLine();

        juego();
    }

    //Desafio 1 (Piedra, Papel o tijera)

    public static void  juego() {
        Scanner eleccion = new Scanner(System.in);

        String eleccionJugador1;
        String eleccionJugador2;

        for (; ; ) {
            System.out.println("Ingrese 1(Piedra), 2(Papel) y 3(Tijera) y 4 (Spock)");
            eleccionJugador1 = eleccion.next();
            eleccionJugador2 = eleccion.next();

            if (eleccionJugador1.equals("*") || eleccionJugador2.equals("*")) {
                return;
            }
            System.out.println(ganador(eleccionJugador1, eleccionJugador2));
        }
    }

    public  static int ganador(String numero1, String numero2){

        if(numero1.equals(numero2)){
            return 0;
        }else if ((numero1.equals(1) && numero2.equals(3)) || (numero1.equals(2) && numero2.equals(1)) || (numero1.equals(3) && numero2.equals(2)) || (numero1.equals(1) && numero2.equals(4)) || (numero1.equals(4) && (numero2.equals(2) || numero2.equals(3)))){
            return 1;
        }else{
            return 2;
        }
    }

}
