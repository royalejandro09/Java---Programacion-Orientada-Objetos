package com.company;

public class UsuarioJuego {

    //Creando los atributos de la clase

    private String nombre;
    private String clave;
    private Double puntaje;
    private int nivel;

    //Creando el contructor

    public UsuarioJuego (String nombre, String clave){
        this.nombre=nombre;
        this.clave=clave;
        this.puntaje=0.0;
        this.nivel=0;
    }

    //Agregando los metodos o responsabilidades de la clase

    public void  aumentarPuntaje (){
        this.puntaje += 1;
    }

    public void subirNivel () {
        this.nivel += 1;
    }

    public void bounus (int valor) {
        this.puntaje += valor;
    }

    //Realizando los getters para usar los atributos en el Main


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public Double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(Double puntaje) {
        this.puntaje = puntaje;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}
