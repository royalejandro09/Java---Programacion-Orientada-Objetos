package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Producto productoy = ProductoFactory.crearProducto(ProductoFactory.COD_PELOTA_FUTBOL);
        Producto productox=ProductoFactory.crearProducto(ProductoFactory.COD_CAJA_10X10);
        System.out.println(productox.clacularEspacio());
        System.out.println(productoy.clacularEspacio());

        Almacen nuevoAlmacen = new Almacen();

        nuevoAlmacen.addProducto(ProductoFactory.COD_CAJA_10X10);
        nuevoAlmacen.addProducto(ProductoFactory.COD_PELOTA_FUTBOL);
        nuevoAlmacen.addProducto(ProductoFactory.COD_PELOTA_TENIS);

        System.out.println(nuevoAlmacen.calcularEspacioNecesario());
        nuevoAlmacen.mostrarProductos();
    }
}
