package com.company;

public class OfertaAcademicaFactory {

    public static final String CODIGO_FULL_STACK = "full-stack";
    public static final String CODIGO_FRONT_END = "front-end";
    public static final String CODIGO_BACK_END = "back-end";

    private static OfertaAcademicaFactory instance;

    private OfertaAcademicaFactory() {

    }

    public static OfertaAcademicaFactory getInstance() {
        if (instance == null) {
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }

    public OfertaAcademica generarOfertaAcademica(String codigo) throws OfertaAcademicaFactoryException {
        switch (codigo) {
            case CODIGO_BACK_END:
                return new Curso("back-end", "codigo", 20, 2, 900.0);
            case CODIGO_FRONT_END:
                return new Curso("front-end", "DOM", 16, 2, 1000.0);
            case CODIGO_FULL_STACK:
                ProgramaIntensivo programaIntensivo = new ProgramaIntensivo("full-stack", "codigo+DOM", 0.2);
                programaIntensivo.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_FRONT_END));
                programaIntensivo.agregarOfertaAcademica(generarOfertaAcademica(CODIGO_BACK_END));
                return programaIntensivo;
            default:
                throw new OfertaAcademicaFactoryException(codigo + " No es un codigo valido");
        }
    }


}
