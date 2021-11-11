package com.company;

public class ProductoFactory {

    //Constantes
    public static final String COD_CAJA_10X10 = "caja10x10";
    public static final String COD_PELOTA_FUTBOL = "pelotaFutbol";
    public static final String COD_PELOTA_TENIS = "pelotaTenis";

    /*************** SINGLETON **********************/
    /**** Atributo Static ***/
    private static ProductoFactory instance;

    /**** Constructor ***/
    public  ProductoFactory(){

    }
    /*** Instanciando Metodo Get Instance  estatico ***/
   public static ProductoFactory getInstance() {
       if(instance == null ){
           instance  = new ProductoFactory();
       }
       return instance;
   }

   /****************** PATRON FACTORY ******************/

   public static Producto crearProducto(String codigoProducto){
       switch (codigoProducto){
           case COD_CAJA_10X10:
               return new ProductoCaja(10.0,10.0,10.0);
           case COD_PELOTA_FUTBOL:
               return new ProductoPelota(11.0);
           case COD_PELOTA_TENIS:
               return new ProductoPelota(3.2);
           default:
               return null;
       }
   }

}
