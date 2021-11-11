package com.company;

public abstract class SistemaArmas {

    private Integer energia;

    public SistemaArmas(Integer energia){
        this.energia = energia;
    }
    public abstract void mostrar();

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getEnergia() {
        return energia;
    }
}


