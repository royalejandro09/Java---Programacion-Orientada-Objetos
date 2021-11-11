package com.company;

public class Perro {


    //Creando los atributos de la clase Perro

    private String nombre;
    private Double peso;
    private String raza;
    private Boolean tieneChip;
    private Boolean estaLastimado;
    private Integer anioDeNacimiento;

    // Constructores


    public Perro(String nombre, Double peso, String raza, Boolean tieneChip, Boolean estaLastimado, Integer anioDeNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.tieneChip = tieneChip;
        this.estaLastimado = estaLastimado;
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public Perro(String nombre, Double peso, String raza, Integer anioDeNacimiento) {
        this.nombre = nombre;
        this.peso = peso;
        this.raza = raza;
        this.anioDeNacimiento = anioDeNacimiento;
        this.estaLastimado = false;
        this.tieneChip = false;

    }

    public boolean sePuedeAdoptar() {
        if (estaLastimado == false && peso >= 5) {
            System.out.println("Este perrito se puede Adoptar ");
            return true;
        } else {
            System.out.println("No lo puedes Adoptar ");
            return false;

        }
    }

    public Integer informarEdad (Integer anioActual){
        return anioActual - anioDeNacimiento;
    }

    public void sePuedePerder(){

        System.out.println("Este perro se puede perder; "+ tieneChip);
    }

    public void ladrar(){
        System.out.println("Guau guauuu");
    }

    //Creando Get and Set




}
