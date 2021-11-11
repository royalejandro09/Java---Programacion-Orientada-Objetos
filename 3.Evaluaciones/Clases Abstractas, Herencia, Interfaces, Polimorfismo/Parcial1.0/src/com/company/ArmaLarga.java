package com.company;

public class ArmaLarga extends Arma implements Comparable {


    //Atributos

    private Boolean renar;
    private String descripcion;
    private int nivelArma;


    //Constructor

    public ArmaLarga(Policia policia, int cantidadDeMunicion, Double alcanceAproximado, String marca, Double calibre, String estado, Boolean renar, String descripcion, int nivelArma) {
        super(policia, cantidadDeMunicion, alcanceAproximado, marca, calibre, estado);
        this.renar = renar;
        this.nivelArma = nivelArma;
        this.descripcion = descripcion;
    }


    //Metodos

    @Override
    public String condicionDeUso() {
        String rta;
        if (getCalibre() >= 9.0 && getEstado() == "En Uso") {
            rta = "El Arma es optima para su uso";
        } else {
            rta = "El Arma NO es optima para su uso";
        }
        return rta;
    }

    //Metodo Interface Comparable

    @Override
    public int compareTo(Object obj) {
        ArmaLarga fusil = (ArmaLarga) obj;
        int comparacion = 0;
        if (this.nivelArma > fusil.nivelArma) {
            comparacion = 1;
        }
        if (this.nivelArma < fusil.nivelArma) {
            comparacion = -1;
        }
        return comparacion;

    }


}
