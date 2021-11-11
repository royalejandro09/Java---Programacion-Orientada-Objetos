package com.company;

public class ExamenParcial extends Examen {

    //Atributos de la clase
    private int unidad;


    //Constructor de la clase
    public ExamenParcial(Alumno alumno, String titulo, String enunciado, Double nota, int unidad) {
        super(alumno, titulo, enunciado, nota);
        this.unidad = unidad;

    }

    //Metodo propio de la clase
    public String reintentos() {
        String rta = "Puedes recuperar maximo 2 veces";
        if (unidad <= 3) {
            rta = "Puedes recuperarlo maximo 3 Veces";
        }
        return rta;

    }

    //Implementando el metodo de la clase Padre
    @Override
    public String consultaExamen() {
        String resultado = "REPROBADO";
        if (getNota() >= 4) {
            resultado = "APROBADO";
        }
        return resultado;
    }
}
