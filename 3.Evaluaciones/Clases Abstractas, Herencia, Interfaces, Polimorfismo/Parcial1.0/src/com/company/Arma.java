package com.company;

public abstract class Arma {

    //Atributos

    private Policia policia;
    private int cantidadDeMunicion;
    private Double alcanceAproximado;
    private String marca;
    private Double calibre;
    private String estado;

    //Constructor

    public Arma(Policia policia, int cantidadDeMunicion, Double alcanceAproximado, String marca, Double calibre, String estado) {
        this.policia = policia;
        this.cantidadDeMunicion = cantidadDeMunicion;
        this.alcanceAproximado = alcanceAproximado;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    //Metodo

    public abstract String condicionDeUso();


    //Metodos Get para acceder a los atributos

    public String getEstado() {
        return this.estado;
    }

    public Double getCalibre() {
        return this.calibre;
    }

    public Double getAlcanceAproximado() {
        return this.alcanceAproximado;
    }

}
