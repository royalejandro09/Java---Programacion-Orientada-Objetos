package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Instanciando el Obj

        ArmaCorta pistola=new ArmaCorta(new Policia("Roy", "Martinez", 12345),10, 250.0,"pistola", 9.0,"En Uso",true);

        ArmaLarga fusilx=new ArmaLarga(new Policia("Roy", "Martinez", 12345),10, 120.0,"pistola", 5.0,"En Uso",true, "ArmaLarga", 5);
        ArmaLarga fusily=new ArmaLarga(new Policia("xx", "xx", 12345),10, 120.0,"pistola", 5.0,"En Uso",true, "ArmaLarga", 3);

        System.out.println(pistola.disparoMaximo());
        System.out.println(pistola.condicionDeUso());

        System.out.println(fusilx.condicionDeUso());

        System.out.println(fusily.compareTo(fusilx));


    }
}
