package org.example;

abstract class Bebida extends Producto {
    /**
     * Clase abstracta utilizada para diferenciar entre Bebidas y Dulces (ambas heredan de Producto)
     * @param numSerie: Valor único para identificar cada producto
     * @see Producto
     * @see Dulce
     */
    public Bebida(int numSerie) {
        super(numSerie);
    }
}