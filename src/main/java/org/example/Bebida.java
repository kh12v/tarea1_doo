package org.example;

abstract class Bebida {
    private int serie;

    public Bebida(int numSerie) {
        serie = numSerie;
    }

    public abstract String beber();

    public int getSerie() {
        return serie;
    }
}