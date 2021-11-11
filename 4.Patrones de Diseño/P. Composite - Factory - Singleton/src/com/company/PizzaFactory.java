package com.company;

public class PizzaFactory {

    public static final String COD_MUZZARELLA = "muzzarella";
    public static final String COD_ESPECIAL = "especial";
    public static final String COD_ANANA = "anana";
    public static final String COD_COMBINADA = "combi";

    private static PizzaFactory instance;

    private PizzaFactory() {

    }

    public static PizzaFactory getInstance() {
        if (instance == null) {
            instance = new PizzaFactory();
        }
        return instance;
    }

    public Pizza generarPizza(String codigo) throws PizzaFactoryException {
        switch (codigo) {
            case COD_MUZZARELLA:
                return new PizzaSimple("muzzarella", "Misma", 700.0, false);
            case COD_ESPECIAL:
                return new PizzaSimple("especial", "especial", 850.0, false);
            case COD_ANANA:
                return new PizzaSimple("anana", "anana", 950.0, false);
            case COD_COMBINADA:
                PizzaCombinada  pizzaCombinada= new PizzaCombinada("Combi", "combinada");
                pizzaCombinada.addPizza(generarPizza(PizzaFactory.COD_ESPECIAL));
                pizzaCombinada.addPizza(generarPizza(PizzaFactory.COD_ANANA));
                return pizzaCombinada;
            default:
                throw new PizzaFactoryException(codigo + " No es un codigo valido");
        }
    }
}
