package org.example;

import java.util.ArrayList;

class Deposito {
    private ArrayList<Bebida> arrayList;

    public Deposito() {
        arrayList = new ArrayList<>();
    }

    public Bebida get() {
        if (arrayList.size() == 0) {
            return null;
        }

        Bebida temp = arrayList.get(0);
        arrayList.remove(0);
        return temp;
    }

    public void add(Bebida bebida) {
        arrayList.add(bebida);
    }
}