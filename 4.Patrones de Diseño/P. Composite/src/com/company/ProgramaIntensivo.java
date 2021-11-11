package com.company;

import java.util.ArrayList;
import java.util.List;

public class ProgramaIntensivo extends OfertaAcademica {

    private List<OfertaAcademica> ofertasAcademicas;
    private Double bonificacion;

    public ProgramaIntensivo(String nombre, String descripcion, Double bonificacion) {
        super(nombre, descripcion);
        this.bonificacion = bonificacion;
        ofertasAcademicas = new ArrayList<>();
    }

    public void agregarOfertaAcademica(OfertaAcademica ofertaAcademica){
        ofertasAcademicas.add(ofertaAcademica);
    }

    @Override
    public Double calcularPrecio() {
        Double sumatoriaPrecioTotal = 0.0;
        for (OfertaAcademica ofertaAcademica : ofertasAcademicas) {
            sumatoriaPrecioTotal += ofertaAcademica.calcularPrecio();
        }
        return sumatoriaPrecioTotal - sumatoriaPrecioTotal*bonificacion;
    }


}
