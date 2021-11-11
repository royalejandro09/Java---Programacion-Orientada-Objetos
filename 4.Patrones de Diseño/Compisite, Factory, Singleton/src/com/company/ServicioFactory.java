package com.company;

public class ServicioFactory {

    private static ServicioFactory instance;

    public static final String COD_SERVICIO_SIMPLE_ = "servicio-simple";
    public static final String COD_SERVICIO_SIMPLE_INST = "servicio-simple-inst";
    public static final String COD_COMBO_SERVICIO = "servicio-combo";

    private ServicioFactory() {

    }

    public static ServicioFactory getInstance() {
        if (instance == null) {
            instance = new ServicioFactory();
        }
        return instance;
    }

    public Servicio generarServicio(String codigo) throws ServicioFactoryException {
        switch (codigo) {
            case COD_SERVICIO_SIMPLE_:
                return new ServicioSimple("venta de aires acondicionados", "SSimple", 65000.0);
            case COD_SERVICIO_SIMPLE_INST:
                return new ServicioSimple("Colocacion", "SSimple", 10000.0);
            case COD_COMBO_SERVICIO:
                ServicioCombo nuevoCombo = new ServicioCombo("ServicioCombo", "Todo Incluido", 0.10);
                nuevoCombo.agregarServicio(generarServicio(COD_SERVICIO_SIMPLE_));
                nuevoCombo.agregarServicio(generarServicio(COD_SERVICIO_SIMPLE_INST));
                return nuevoCombo;
            default:
                throw new ServicioFactoryException(codigo + " no es un codigo valido");
        }
    }
}
