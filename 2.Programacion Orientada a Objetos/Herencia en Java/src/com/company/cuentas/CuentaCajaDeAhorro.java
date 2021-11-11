package com.company.cuentas;

import com.company.Cliente;

public class CuentaCajaDeAhorro extends Cuenta {

    private Double tasaDeInteres;

    public CuentaCajaDeAhorro(Cliente cliente, Double tasaDeInteres) {
        super(cliente);
        this.tasaDeInteres = tasaDeInteres;
    }

    @Override
    public void extraer(Double monto) {
        if(getSaldo() >= monto){
            setSaldo(getSaldo() - monto);
            System.out.println("retire " + monto + " nuevo saldo: " + getSaldo());
        }else{
            System.out.println(" saldo insuficiente");
        }
    }

    public void cobrarInteres(){
        setSaldo(getSaldo() + getSaldo() * tasaDeInteres);
    }
}
