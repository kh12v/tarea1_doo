package org.example;

import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> arrayList;

    /**
     * Se almacenará dentro de un ArrayList elementos de tipo genérico
     * en un orden FIFO
     * @see ArrayList
     */
    public Deposito() {
        arrayList = new ArrayList<>();
    }

    /**
     * @return El primero valor almacenado en el ArrayList.
     * Retorna null si el ArrayList está vacío
     */
    public T get() {
        if (arrayList.isEmpty()) {
            return null;
        }

        T temp = arrayList.get(0);
        arrayList.remove(0);
        return temp;
    }

    /**
     * Guarda el elemento al final del ArrayList
     * @param elemento: El elemento que se desea almacenar dentro del ArrayList
     */
    public void add(T elemento) {
        if (elemento == null) return;

        arrayList.add(elemento);
    }
}