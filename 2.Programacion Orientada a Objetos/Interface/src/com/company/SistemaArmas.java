package com.company;

public abstract class SistemaArmas {

    //Atributo
    private Integer energia;


    //Constructor
    public SistemaArmas(Integer energia){
        this.energia=energia;
    }

    //Metodos Abtractos
    public abstract void mostrar();

    //Get and Set
    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }
}
