package org.example;

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2, 100);

        // Comprar con vuelto
        Comprador c = new Comprador(new Moneda500(), Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin vuelto
        c = new Comprador(new Moneda100(), Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin bebidas
        c = new Comprador(new Moneda1000(), Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin moneda
        c = new Comprador(null, Expendedor.SPRITE, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar bebida no existente
        c = new Comprador(new Moneda1000(), 3, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());
    }
}