package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here

        Paciente roy=null;


        try{
             roy=new Paciente("roy", "martinez",new Date(121, 9, 02));
        }catch (FechaInvalidaException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try{
            roy.darDeAlta(new Date(121,12,31));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
