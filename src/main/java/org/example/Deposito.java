package org.example;

import java.util.ArrayList;

class Deposito<T> {
    private ArrayList<T> arrayList;

    public Deposito() {
        arrayList = new ArrayList<>();
    }

    public T get() {
        if (arrayList.isEmpty()) {
            return null;
        }

        T temp = arrayList.get(0);
        arrayList.remove(0);
        return temp;
    }

    public void add(T producto) {
        if (producto == null) return;

        arrayList.add(producto);
    }
}