package com.company;

public class ServicioSimple extends Servicio {

    private Double precio;

    public ServicioSimple(String nombre, String descripcion, Double precio) {
        super(nombre, descripcion);
        this.precio = precio;
    }


    @Override
    public Double calcularPrecio() {
        if (this.getNombre().equals("Colocacion")) {
            precio = precio * 1.10;
        }
        return precio;
    }

}
