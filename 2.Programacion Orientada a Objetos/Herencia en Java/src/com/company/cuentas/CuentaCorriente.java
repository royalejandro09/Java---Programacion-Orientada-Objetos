package com.company.cuentas;

import com.company.Cheque;
import com.company.Cliente;
import com.company.cuentas.Cuenta;

public class CuentaCorriente extends Cuenta {

    private Double descubiertoPermitido;

    public CuentaCorriente(Cliente cliente, Double descubiertoPermitido) {
        super(cliente);
        this.descubiertoPermitido = descubiertoPermitido;
    }

    @Override
    public void extraer(Double monto) {
        if(cuantoPuedoRetirar() >= monto){
            setSaldo(getSaldo() - monto);
            System.out.println("retire " + monto + " nuevo saldo: " + getSaldo());
        }else{
            System.out.println(" saldo insuficiente");
        }
    }

    public Double cuantoPuedoRetirar(){
        return getSaldo() + descubiertoPermitido;
    }

    public void depositar(Cheque cheque){
        depositar(cheque.getMonto());

    }

}
