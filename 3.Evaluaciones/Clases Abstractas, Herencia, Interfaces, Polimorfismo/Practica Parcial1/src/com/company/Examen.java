package com.company;

public abstract class Examen {

    //Atributos de la clase Abstracta
    private Alumno alumno;
    private String titulo;
    private String enunciado;
    private Double nota;

    //Constructor
    public Examen(Alumno alumno, String titulo, String enunciado, Double nota) {
        this.alumno = alumno;
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.nota = nota;
    }

    //Metodo abstracto de la clase
    public abstract String consultaExamen();

    //Metodos Get para acceder a los atrivutos de la clase Abstracta
    public double getNota(){
        return nota;
    }




}
