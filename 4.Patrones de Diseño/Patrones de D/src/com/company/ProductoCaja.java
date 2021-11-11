package com.company;

public class ProductoCaja extends Producto{

    private Double longitud;
    private Double ancho;
    private Double altura;


    public ProductoCaja(){

    }

    public ProductoCaja(Double peso) {
        super(peso);
    }

    public ProductoCaja (Double longitud, Double ancho, Double altura){
        this.longitud=longitud;
        this.altura=altura;
        this.ancho=ancho;
    }


    @Override
    public double clacularEspacio() {
        return this.longitud*this.ancho*this.altura;
    }

    @Override
    public String toString() {
        return "ProductoCaja{" +
                "longitud=" + longitud +
                ", ancho=" + ancho +
                ", altura=" + altura +
                '}';
    }
}
