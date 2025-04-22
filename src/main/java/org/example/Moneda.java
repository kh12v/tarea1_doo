package org.example;

abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    @Override
    public String toString() {
        return "Moneda:\n-Serie: " + getSerie() + "\n-Valor: " + getValor();
    }

    @Override
    public int compareTo(Moneda c) {
        int valor = getValor();
        int valor2 = c.getValor();

        if (valor < valor2) {
            return 1;
        } else if (valor > valor2) {
            return -1;
        } else {
            return 0;
        }
    }
}

