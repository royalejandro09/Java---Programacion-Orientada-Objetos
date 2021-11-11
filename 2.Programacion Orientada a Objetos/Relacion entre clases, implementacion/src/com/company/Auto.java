package com.company;

public class Auto {

    //DECLARANDO LOS ATRIBUTOS DE LA CLASE
    private String patente;
    private String marca;
    private String modelo;
    private Motor motor;


    //CREANDO EL CONSTRUCTOR
    public Auto(String patente, String marca, String modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
        //Creo la instancia de Motor para utilizarla luego ya que no tiene
        //Valores iniciales (Atributos)
        motor = new Motor();
    }

    //CREANDO LOS METODOS DE ACCESO A LOS ATRIBUTOS GET Y SET
    public String getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }
}
