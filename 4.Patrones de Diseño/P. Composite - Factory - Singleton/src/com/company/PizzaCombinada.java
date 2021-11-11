package com.company;

import java.util.ArrayList;
import java.util.List;

public class PizzaCombinada extends Pizza {

    private List<Pizza> pizzas;

    public PizzaCombinada(String nombre, String descripcion) {
        super(nombre, descripcion);
        pizzas = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    @Override
    public Double calcularPrecio() {
        Double precio = 0.0;
        for (Pizza pizza : pizzas) {
            precio += pizza.calcularPrecio()/ pizzas.size();
        }
        return precio;
    }
}
