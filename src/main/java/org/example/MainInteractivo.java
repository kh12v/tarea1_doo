package org.example;
import java.util.Scanner;

public class MainInteractivo {
    /**
     * Imprime en consola el menú con las opciones de compra para el usuario
     */
    public static void ImprimirOpciones(){
        System.out.println("Elija el producto que desea comprar");
        System.out.println("-----Bebidas:------");
        System.out.println("1. Coca Cola: $" + Expendedor.Productos.COCA.precio);
        System.out.println("2. Sprite: $" + Expendedor.Productos.SPRITE.precio);
        System.out.println("3. Fanta: $" + Expendedor.Productos.FANTA.precio);
        System.out.println("-----Dulces:-----");
        System.out.println("4. Snickers: $" + Expendedor.Productos.SNICKERS.precio);
        System.out.println("5. Super8: $" + Expendedor.Productos.SUPER8.precio);
        System.out.print("---->");
    }

    /**
     * Devuelve la moneda con el valor especificado en el argumento.
     * Los valores válidos son 100, 500, 1000 y 1500
     * @param m: Valor de la moneda que se quiere obtener
     * @return
     */
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

    /**
     * Main interactivo el cual permite al usuario interactuar con un expendedor
     * @param args: Argumentos que recibe el programa al ejecutarse. El programa no requiere argumentos
     */
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
