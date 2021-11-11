package Contenedor;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Clase2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //Ejercicio 1
        System.out.println("Ingrese un numero");
        int numero = lector.nextInt();

        System.out.println(esPrimo(numero));

//Ejercicio2
        System.out.println("Ingrese Tres numeros");
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();
        int num3 = lector.nextInt();

        System.out.println(MaximodeTresNumeros(num1, num2, num3));

        //Ejercico3

        System.out.println("Digite su texto");
        String texto1 = lector.next();
        String texto2 = lector.next();

        System.out.println(cadenasDeTexto(texto1, texto2));
    }

    //Ejercicio 1

    public static boolean esPrimo(int numero) {

        // El 0, 1 y 4 no son primos
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int i = 2; i < numero / 2; i++) {
            // Si es divisible por cualquiera de estos números, no es primo
            if (numero % i == 0) {
                return false;
            }
        }
        // Si no se pudo dividir por ninguno de los anteriores, sí es Primo
        System.out.println("Este es un numero Primo");
        return true;

    }

    //Ejercicio 2

    public static Integer MaximodeTresNumeros(Integer num1, Integer num2, Integer num3) {

        Integer mayor;
        int comparar1y2 = num1.compareTo(num2);


        if (comparar1y2 == 1) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        int maximoDeTres = mayor.compareTo(num3);

        if (maximoDeTres == 1) {
            return mayor;
        } else {
            return num3;
        }

    }


    //Ejercicio3

    public static boolean cadenasDeTexto(String texto1, String texto2) {

       return  !(texto1.equals(texto2));


    }
}