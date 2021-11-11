package com.company;

import java.util.ArrayList;
import java.util.List;

public class Pizzeria {

    private List<Pizza> pizzas;

    public Pizzeria() {
        pizzas = new ArrayList<>();
    }

    public void agregarPizzas(String cod) {
        try {
            pizzas.add(PizzaFactory.getInstance().generarPizza(cod));
        } catch (PizzaFactoryException e) {
            e.printStackTrace();
            //System.out.println("Este es un error del codigo ingresado para crear la Pizza");
        }
    }

    public void mostrarPizzas() {
        for (Pizza pizza : pizzas) {
            System.out.println("Nombre: " + pizza.getNombre() + " Precio: " + pizza.calcularPrecio());
        }
    }
}
