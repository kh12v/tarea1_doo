package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Expendedor exp1 = new Expendedor(2, 1000);
        Expendedor exp2 = new Expendedor(2, 1000);
        Comprador c;
        Moneda m;

        System.out.println("-----Producto que no vende-----");
        m = new Moneda1000();
        c = new Comprador(m,Expendedor.Productos.NULO, exp1);
        System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto()+"\n");

        System.out.println("-----Comprar Super8 sin moneda-----");
        for(int i=0;i<2;i++){
            c = new Comprador(null,Expendedor.Productos.SUPER8, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con dinero Justo para el precio Super8-----");
        for(int i=0;i<2;i++){
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.Productos.SUPER8, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Comprar CocaCola sin moneda-----");
        for(int i=0;i<2;i++){
            c = new Comprador(null,Expendedor.Productos.COCA, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con dinero Justo para el precio CocaCola-----");
        for(int i=0;i<2;i++){
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.Productos.COCA, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con menos dinero que el precio Sprite-----");
        for(int i=0;i<2;i++){
            m = new Moneda500();
            c = new Comprador(m,Expendedor.Productos.SPRITE, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con mas dinero que el precio Sprite-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SPRITE, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Comprar Fanta sin moneda-----");
        for(int i=0;i<2;i++){
            c = new Comprador(null,Expendedor.Productos.FANTA, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con dinero Justo para el precio Fanta-----");
        for(int i=0;i<2;i++){
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.Productos.FANTA, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con menos dinero que el precio Snickers-----");
        for(int i=0;i<2;i++){
            m = new Moneda500();
            c = new Comprador(m,Expendedor.Productos.SNICKERS, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con mas dinero que el precio Snickers-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SNICKERS, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 1 Vacío CocaCola-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.COCA, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 1 Vacío Sprite-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SPRITE, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 1 Vacío Fanta-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.FANTA, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 1 Vacío Snickers-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SNICKERS, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 1 Vacío Super8-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SUPER8, exp1);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Comprar Sprite sin moneda-----");
        for(int i=0;i<2;i++){
            c = new Comprador(null,Expendedor.Productos.SPRITE, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con dinero Justo para el precio Sprite-----");
        for(int i=0;i<2;i++){
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.Productos.SPRITE, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con menos dinero que el precio CocaCola-----");
        for(int i=0;i<2;i++){
            m = new Moneda500();
            c = new Comprador(m,Expendedor.Productos.COCA, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con mas dinero que el precio CocaCola-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.COCA, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Comprar Snickers sin moneda-----");
        for(int i=0;i<2;i++){
            c = new Comprador(null,Expendedor.Productos.SNICKERS, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con dinero Justo para el precio Snickers-----");
        for(int i=0;i<2;i++){
            m = new Moneda1000();
            c = new Comprador(m,Expendedor.Productos.SNICKERS, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con menos dinero que el precio Fanta-----");
        for(int i=0;i<2;i++){
            m = new Moneda500();
            c = new Comprador(m,Expendedor.Productos.FANTA, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con mas dinero que el precio Fanta-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.FANTA, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con menos dinero que el precio Super8-----");
        for(int i=0;i<2;i++){
            m = new Moneda500();
            c = new Comprador(m,Expendedor.Productos.SUPER8, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Con mas dinero que el precio Super8-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SUPER8, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 2 Vacío CocaCola-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.COCA, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 2 Vacío Sprite-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SPRITE, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 2 Vacío Fanta-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.FANTA, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 2 Vacío Snickers-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SNICKERS, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        System.out.println("\n-----Deposito 2 Vacío Super8-----");
        for(int i=0;i<2;i++){
            m = new Moneda1500();
            c = new Comprador(m,Expendedor.Productos.SUPER8, exp2);
            System.out.println("Bebida comprada: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
        }

        // Se crea una lista de monedas para luego ser ordenadas de mayor a menor
        // utilizando el método sort
        ArrayList<Moneda> monedas = new ArrayList<>();

        // Se crean monedas de manera desordenada
        monedas.add(new Moneda100());
        monedas.add(new Moneda100());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda500());

        System.out.println("\nDepósito de monedas desordenado:");
        for (Moneda moneda : monedas) {
            if (moneda == null) {
                System.out.println("null");
            } else {
                System.out.println(moneda.getValor());
            }
        }

        monedas.sort(null);

        System.out.println("\nDepósito de monedas ordenado:");
        for (Moneda moneda : monedas) {
            if (moneda == null) {
                System.out.println("null");
            } else {
                System.out.println(moneda.getValor());
            }
        }
    }
}