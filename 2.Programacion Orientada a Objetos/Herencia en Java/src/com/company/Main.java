package com.company;




import com.company.cuentas.Cuenta;
import com.company.cuentas.CuentaCorriente;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
	// write your code here

    CuentaCorriente cuenta = new CuentaCorriente(new Cliente(),3000.0);

    Cheque cheque = new Cheque("bbva",300.0,new Date());


    cuenta.depositar(200.0);
    cuenta.depositar(cheque);







    }
}
