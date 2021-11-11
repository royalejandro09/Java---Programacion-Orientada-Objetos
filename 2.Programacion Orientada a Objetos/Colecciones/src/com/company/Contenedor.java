package com.company;

public class Contenedor implements Comparable<Contenedor> {

    private int id;
    private String paisDeProcedencia;
    private Boolean marca;


    public Contenedor(int id, String paisDeProcedencia, Boolean marca) {
        this.id = id;
        this.paisDeProcedencia = paisDeProcedencia;
        this.marca = marca;
    }

    public String getPaisDeProcedencia() {
        return paisDeProcedencia;
    }

    public Boolean getMarca() {
        return marca;
    }

    //SOBREESCRIBIMOS EL TOsTRING PARA PODER IMPRIMIR POR CONSOLA LOS DATOS DE LOS CONTENEDORES
    @Override
    public String toString() {
        return "Contenedor{" +
                "id=" + id +
                ", paisDeProcedencia='" + paisDeProcedencia + '\'' +
                ", marca=" + marca +
                '}';
    }

    //UTILIZAMOS LA INTERFACE COMPARABLE PARA ORDENAR LOS CONTENEDORES POR ID
    @Override
    public int compareTo(Contenedor o) {
        if(this.id < o.id){
            return -1;
        }
        if(this.id > o.id){
            return 1;
        }
        return 0;
    }
}
