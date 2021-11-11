package com.company;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDeServicio {

    private List<Servicio> servicios;

    public EmpresaDeServicio() {
        servicios = new ArrayList<>();
    }

    public void agregarServicio(String codigo){
        try {
            servicios.add(ServicioFactory.getInstance().generarServicio(codigo));
        } catch (ServicioFactoryException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public void mostrarServicios(){
        for (Servicio servicio : servicios) {
            System.out.println("Nombre del servicio: " + servicio.getNombre() + " Precio: " + servicio.calcularPrecio());
        }
    }
}
