package com.company;

public class ArmaCorta extends Arma {

    //Atributos

    private Boolean automatica;


    //Constructor

    public ArmaCorta(Policia policia, int cantidadDeMunicion, Double alcanceAproximado, String marca, Double calibre, String estado, Boolean automatica) {
        super(policia, cantidadDeMunicion, alcanceAproximado, marca, calibre, estado);
        this.automatica = automatica;
    }

    //Metodos

    public String disparoMaximo() {
        return "La longitud maxima de disparo de esta arma es de:" + getAlcanceAproximado()+"metros";
    }

    @Override
    public String condicionDeUso() {
        String rta;
        if (getCalibre() >= 9.0 && getEstado() == "En Uso") {
            rta = "El Arma es optima para su uso";
        } else {
            rta = "El Arma NO es optima para su uso";
        }
        return rta;
    }


}
