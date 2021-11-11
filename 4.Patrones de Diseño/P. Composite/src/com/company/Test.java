package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

    Instituto instituto1 = new Instituto();
    instituto1.agregarCurso(OfertaAcademicaFactory.CODIGO_BACK_END);
    instituto1.agregarCurso(OfertaAcademicaFactory.CODIGO_FRONT_END);
    instituto1.agregarCurso(OfertaAcademicaFactory.CODIGO_FULL_STACK);

    instituto1.agregarCurso("CODIGO");

    instituto1.generarInforme();
    }
}
