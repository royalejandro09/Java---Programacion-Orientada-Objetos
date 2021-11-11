package com.company;

public class ProductoPelota extends Producto{

    private Double radio;

    public ProductoPelota (Double peso, Double radio){
        super(peso);
        this.radio=radio;
    }

    public ProductoPelota(Double radio){
        this.radio=radio;
    }

    @Override
    public double clacularEspacio() {
        return (4/3)*Math.PI*(radio*radio*radio);
    }

    @Override
    public String toString() {
        return "ProductoPelota{" +
                "radio=" + radio +
                '}';
    }
}
