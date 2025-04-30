package org.example;

abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}

    /**
     * @return La referencia a al objeto moneda
     */
    public Moneda getSerie() {
        return this;
    }

    /**
     * @return El valor monetario de la moneda
     */
    public abstract int getValor();

    /**
     * @return Un string que incluye el valor de la serie y el valor monetario de la moneda
     */
    @Override
    public String toString() {
        return "Moneda:\n-Serie: " + getSerie() + "\n-Valor: " + getValor();
    }

    /**
     * Compara el valor monetario entre la moneda actual y otra pasada como parámetro.
     * Esto permite ordenar de menor a mayor o mayor a menor una lista de monedas.
     * 1 si getValor() < c.getValor()
     * -1 si getValor() > c.getValor()
     * 0 si getValor() == c.getValor()
     * @param c Objeto al que será comparado
     * @return El valor comparativo respecto a el valor monetario
     */
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

