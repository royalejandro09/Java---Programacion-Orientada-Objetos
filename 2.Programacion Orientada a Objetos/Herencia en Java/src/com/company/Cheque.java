package com.company;

import java.util.Date;

public class Cheque {

    private String banco;
    private Double monto;
    private Date fechaDeEmision;

    public Cheque(String banco, Double monto, Date fechaDeEmision) {
        this.banco = banco;
        this.monto = monto;
        this.fechaDeEmision = fechaDeEmision;
    }

    public Double getMonto() {
        return monto;
    }
}
