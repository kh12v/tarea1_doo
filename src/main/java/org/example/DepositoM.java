package org.example;

import java.util.ArrayList;

class DepositoM {
    private final ArrayList<Moneda> arrayList;

    public DepositoM() {
        arrayList = new ArrayList<>();
    }

    public Moneda get() {
        if (arrayList.isEmpty()) {
            return null;
        }

        Moneda temp = arrayList.get(0);
        arrayList.remove(0);
        return temp;
    }

    public void add(Moneda m) {
        arrayList.add(m);
    }
}
