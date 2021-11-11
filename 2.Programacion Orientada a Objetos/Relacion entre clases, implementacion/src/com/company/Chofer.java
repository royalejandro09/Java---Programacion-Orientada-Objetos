package com.company;

public class Chofer {

    //DECLARANDO LOS ATRIBUTOS DE LA CLASE
    private String nombre;
    private String apellido;
    //DECLARANDO EL ATRIBUTO DE LA CLASE AUTO (El Chofer tiene un auto asignado)
    private Auto auto;

    //Creando el constructor
    public Chofer(String nombre, String apellido, Auto auto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.auto=auto;
    }

    //Definiendo las responsabvilidades y metodos de la clas
    public String verPatente() {
        return auto.getPatente();

    }
    public String verMarca(){
        return auto.getMarca();
    }
}
