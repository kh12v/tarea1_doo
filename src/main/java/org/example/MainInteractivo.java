package org.example;
import java.util.Scanner;

public class MainInteractivo {
    public static void ImprimirOpciones(){
        System.out.println("Elija el producto que desea comprar");
        System.out.println("-----Bebidas:------");
        System.out.println("$" + Expendedor.Productos.COCA.precio + " Coca Cola: 1");
        System.out.println("$" + Expendedor.Productos.SPRITE.precio + "Sprite: 2");
        System.out.println("$" + Expendedor.Productos.FANTA.precio + "Fanta: 3");
        System.out.println("-----Dulces:-----");
        System.out.println("$" + Expendedor.Productos.SNICKERS.precio + "Snickers: 4");
        System.out.println("$" + Expendedor.Productos.SUPER8.precio + "Super8: 5");
        System.out.print("---->");
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
        Expendedor exp = new Expendedor(2);
        Scanner sc = new Scanner(System.in);
        Comprador c;
        ImprimirOpciones();
        while(sc.hasNext()) {
            if(sc.hasNextInt()){
                int seleccion=sc.nextInt();
                System.out.println("Ingrese su Moneda:   //(100, 500, 1000, 1500)");
                System.out.print("---->");
                int moneda=sc.nextInt();
                switch (seleccion){
                    case 1:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.COCA, exp);
                        System.out.println("\n** Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto()+" **\n");
                        break;
                    case 2:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.SPRITE, exp);
                        System.out.println("\n** Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto()+" **\n");
                        break;
                    case 3:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.FANTA, exp);
                        System.out.println("\n** Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto()+" **\n");
                        break;
                    case 4:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.SNICKERS, exp);
                        System.out.println("\n** Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto()+" **\n");
                        break;
                    case 5:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.SUPER8, exp);
                        System.out.println("\n** Producto comprado: "+c.queConsumiste()+", "+"vuelto: "+c.cuantoVuelto()+" **\n");
                        break;
                    default:
                        c=new Comprador(ElegirMoneda(moneda), Expendedor.Productos.NULO, exp);
                        System.out.println("\n** vuelto: "+c.cuantoVuelto()+" **\n");
                }
            }else{
                String s= sc.next();
                if(s.equalsIgnoreCase("salir")){
                    break;
                }else{
                    System.out.println("Entrada invalida!\n");
                }
            }
            System.out.println("///Para salir de la maquina escriba 'salir'\\\\\\\n");
            ImprimirOpciones();
        }
    }
}
