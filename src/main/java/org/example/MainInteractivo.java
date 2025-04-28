package org.example;

import java.util.Scanner;

public class MainInteractivo {
    private Scanner sc = new Scanner(System.in);
    public static void ImprimirOpciones(){
        System.out.println("Elija el producto que desea comprar");
        System.out.println("-----Bebidas:------");
        System.out.println("Coca Cola: 1");
        System.out.println("Sprite: 2");
        System.out.println("Fante: 3");
        System.out.println("-----Dulces:-----");
        System.out.println("Snickers: 4");
        System.out.println("Super8: 5");
    }
    public void BucleComprar(){
        System.out.println("Para terminar el programa escriba terminar");
        while(!"terminar".equals(sc)) {
            ImprimirOpciones();
            int eleccion = sc.nextInt();
            System.out.println("Con que Moneda? (100,500,1000,1500)");
            int moneda = sc.nextInt();
        }
    }
}
