package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2, 100);

        // Comprar con vuelto
        Comprador c = new Comprador(new Moneda500(), Expendedor.Productos.COCA, exp);
        System.out.println("Bebida: " + c.queConsumiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin vuelto
        c = new Comprador(new Moneda100(), Expendedor.Productos.COCA, exp);
        System.out.println("Bebida: " + c.queConsumiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin bebidas
        c = new Comprador(new Moneda1000(), Expendedor.Productos.COCA, exp);
        System.out.println("Bebida: " + c.queConsumiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin moneda
        c = new Comprador(null, Expendedor.Productos.SPRITE, exp);
        System.out.println("Bebida: " + c.queConsumiste() + "; Vuelto: " + c.cuantoVuelto());

        // Se crea una lista de monedas para luego ser ordenadas de mayor a menor
        // utilizando el método sort
        ArrayList<Moneda> monedas = new ArrayList<Moneda>();

        // Se crean monedas de manera desordenada
        monedas.add(new Moneda100());
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda500());
        monedas.add(new Moneda100());

        System.out.println("Depósito de monedas desordenado:");
        for (Moneda m : monedas) {
            if (m == null) {
                System.out.println("null");
            } else {
                System.out.println(m.getValor());
            }
        }

        monedas.sort(null);

        System.out.println("Depósito de monedas ordenado:");
        for (Moneda m : monedas) {
            if (m == null) {
                System.out.println("null");
            } else {
                System.out.println(m.getValor());
            }
        }
    }
}