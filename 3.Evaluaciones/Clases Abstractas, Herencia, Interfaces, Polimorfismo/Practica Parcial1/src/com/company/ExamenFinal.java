package com.company;

public class ExamenFinal extends Examen implements Comparable {

    //Atributos de la clase
    private Double notaOral;
    private String descripcion;
    private Double promedio;


    //Constructor de la clase
    public ExamenFinal(Alumno alumno, String titulo, String enunciado, Double nota, Double notaOral, String descripcion) {
        super(alumno, titulo, enunciado, nota);
        this.notaOral = notaOral;
        this.descripcion = descripcion;
        this.promedio=(getNota()+notaOral)/2;
    }


    //Metodo de la clase Padre
    @Override
    public String consultaExamen() {
        String resultado = "REPROBADO";
        if (getNota() >= 4) {
            resultado = "APROBADO";
        }
        return resultado;
    }

    //Metodo de la interface Comparable de Java


    @Override
    public int compareTo(Object obj) {
        ExamenFinal examenUnico = (ExamenFinal) obj;
        int comparacion = 0;
        if (this.promedio > examenUnico.promedio) {
            comparacion = 1;
        }
        if (this.promedio < examenUnico.promedio) {
            comparacion = -1;
        }
        return comparacion;

    }


}
