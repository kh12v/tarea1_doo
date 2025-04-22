package org.example;

public abstract class Producto {
    private int serie;

    public Producto(int numSerie) {
        this.serie = numSerie;
    }

    public abstract String consumir();

    public int getSerie() {
        return serie;
    }
}
