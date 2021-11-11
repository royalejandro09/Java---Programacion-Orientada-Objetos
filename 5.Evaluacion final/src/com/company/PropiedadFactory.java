package com.company;

public class PropiedadFactory {

    public static final String COD_CASA_1 = "casa1";
    public static final String COD_CASA_2 = "casa 2";
    public static final String BARRIO_CERRADO = "barrio cerrado";
    private static PropiedadFactory instance;

    private PropiedadFactory() {
    }

    public static PropiedadFactory getInstance() {
        if (instance == null) {
            instance = new PropiedadFactory();
        }
        return instance;
    }

    public Propiedad generarPropiedad(String cod) throws PropiedadFactoryException {
        switch (cod) {
            case COD_CASA_1:
                return new PropiedadCasa("Av. San Martin", 130, 500.0);
            case COD_CASA_2:
                return new PropiedadCasa("Mitre", 233, 700.0);
            case BARRIO_CERRADO:
                PropiedadBarrioCerrado barrioCerrado1 = new PropiedadBarrioCerrado("Gutierres", 330, 2);
                barrioCerrado1.addPropiedad(generarPropiedad(PropiedadFactory.COD_CASA_1));
                barrioCerrado1.addPropiedad(generarPropiedad(PropiedadFactory.COD_CASA_2));
                return barrioCerrado1;
            default:
                throw new PropiedadFactoryException(cod + " No es un codigo Valido");
        }
    }
}
