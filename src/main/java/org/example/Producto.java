package org.example;

public abstract class Producto {
    private int serie;

    /**
     * @param numSerie: Valor único para identificar cada producto
     */
    public Producto(int numSerie) {
        this.serie = numSerie;
    }

    /**
     * Comprador almacena el string retornado por esta clase cada vez que consume
     * el producto
     * @return String único que cada producto debe especificar
     */
    public abstract String consumir();

    /**
     * @return Número único para identificar cad producto
     */
    public int getSerie() {
        return serie;
    }
}
