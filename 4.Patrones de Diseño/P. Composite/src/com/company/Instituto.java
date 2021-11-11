package com.company;

import java.util.ArrayList;
import java.util.List;

public class Instituto {

    private List<OfertaAcademica> ofertasAcademicas;

    public Instituto() {
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarCurso(String codigo) {
        try {
            ofertasAcademicas.add(OfertaAcademicaFactory.getInstance().generarOfertaAcademica(codigo));
        } catch (OfertaAcademicaFactoryException e) {
            e.printStackTrace();
            //System.out.println(e.getMessage());
        }
    }

    public void generarInforme() {
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            System.out.println("nombre: " + ofertaAcademica.getNombre() + " precio: " + ofertaAcademica.calcularPrecio());
        }
    }
}
