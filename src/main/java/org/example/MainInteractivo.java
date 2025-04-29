package org.example;
import java.util.Scanner;

public class MainInteractivo {
    public static void ImprimirOpciones(){
        System.out.println("Elija el producto que desea comprar");
        System.out.println("-----Bebidas:------");
        System.out.println("Coca Cola: 1");
        System.out.println("Sprite: 2");
        System.out.println("Fanta: 3");
        System.out.println("-----Dulces:-----");
        System.out.println("Snickers: 4");
        System.out.println("Super8: 5");
    }
    private static Moneda ElegirMoneda(int m){
        switch(m){
            case 100:
                return new Moneda100();
            case 500:
                return new Moneda500();
            case 1000:
                return new Moneda1000();
            case 1500:
                return new Moneda1500();
            default:
                System.out.println("Moneda no valida");
                return null;
        }
    }

    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2, 200);
        Scanner sc = new Scanner(System.in);
        Comprador c;
        ImprimirOpciones();
        //System.out.println("Para salir de la maquina escriba 'salir'");
        while(sc.hasNext()) {
            if(sc.hasNextInt()){
                int seleccion=sc.nextInt();
                System.out.println("Ingrese su Moneda:                              //(100, 500, 1000, 1500)");
                int moneda=sc.nextInt();
                switch (seleccion){
                    case 1:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.COCA, exp);
                        System.out.println("Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
                    case 2:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.SPRITE, exp);
                        System.out.println("Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
                    case 3:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.FANTA, exp);
                        System.out.println("Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
                    case 4:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.SNICKERS, exp);
                        System.out.println("Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
                    case 5:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.SUPER8, exp);
                        System.out.println("Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
                    default:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.NULO, exp);
                        System.out.println("Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto());
                }
            }else{
                String s= sc.next();
                if(s.equalsIgnoreCase("salir")){
                    break;
                }else{
                    System.out.println("Entrada Invalida, ingrese un valor entero o 'terminar para terminar programa");
                }
            }
            ImprimirOpciones();
        }
    }
}
