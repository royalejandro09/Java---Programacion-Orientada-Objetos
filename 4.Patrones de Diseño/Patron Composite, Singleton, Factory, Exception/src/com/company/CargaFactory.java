package com.company;

public class CargaFactory {

    private static CargaFactory instance;

    public static final String COD_TV = "tv-32-lcd";
    public static final String COD_MEDICINE = "medicamentos";
    public static final String COD_CONTENEDOR = "carga-simples";

    private CargaFactory() {

    }

    public static CargaFactory getInstance() {
        if (instance == null) {
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga generarCarga(String codigo) throws Exception {
        switch (codigo) {
            case COD_TV:
                return new CargaSimple("TV32’LCD", 3.0, false);
            case COD_MEDICINE:
                return new CargaSimple("medicamentos", 2.0, true);
            case COD_CONTENEDOR:
                Contenedor contenedor = new Contenedor("Contenedor1", 100.0);
                contenedor.addCarga(generarCarga(CargaFactory.COD_TV));
                contenedor.addCarga(generarCarga(CargaFactory.COD_MEDICINE));
                return contenedor;
            default:
                throw new CargaFactoryException(codigo + " no es un codigo valido");
        }
    }
}
