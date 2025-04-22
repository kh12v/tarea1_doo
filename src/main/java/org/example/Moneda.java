package org.example;

abstract class Moneda {
    public Moneda() {}

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();

    @Override
    public String toString() {
        return "Moneda:\n-Serie: " + getSerie() + "\n-Valor: " + getValor();
    }
}

