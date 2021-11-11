package com.company;

public class Test {

    public static void main(String[] args) {
	// write your code here

        Pizzeria miPizzeria = new Pizzeria();

        miPizzeria.agregarPizzas(PizzaFactory.COD_MUZZARELLA);
        miPizzeria.agregarPizzas(PizzaFactory.COD_ESPECIAL);
        miPizzeria.agregarPizzas(PizzaFactory.COD_ANANA);
        miPizzeria.agregarPizzas(PizzaFactory.COD_COMBINADA);

        miPizzeria.agregarPizzas("HAWAIANA");

        miPizzeria.mostrarPizzas();

    }
}
