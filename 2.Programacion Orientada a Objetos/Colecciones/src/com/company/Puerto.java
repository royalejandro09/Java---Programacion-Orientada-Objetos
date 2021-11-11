package com.company;

import java.util.ArrayList;
import java.util.List;

public class Puerto {

    private String nombre;
    private List<Contenedor> contenedores;


    //CONSTRUCTOR
    public Puerto(String nombre) {
        this.nombre = nombre;
        this.contenedores = new ArrayList<>();
    }

    //METODOS
    public void addContenedor(Contenedor contenedor) {
        contenedores.add(contenedor);
        contenedores.sort(null);
    }

    public Integer getCantidadContenedoresPeligrososProcedenciaDesconocida() {
        Integer contenedoresPeligrosoDesconocidos = 0;
        for (Contenedor contenedor : contenedores) {
            if (contenedor.getMarca() && contenedor.getPaisDeProcedencia().equals("Desconocido")) {
                contenedoresPeligrosoDesconocidos++;
            }
        }
        return contenedoresPeligrosoDesconocidos;
    }

    public Integer cantidadContenedores() {
        return contenedores.size();
    }

    public void mostrarContenedores() {
        contenedores.sort(null);
        for (Contenedor contenedor : contenedores) {
            System.out.println(contenedor);
        }



    }
}
