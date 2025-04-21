package org.example;

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    private int precio;

    public static final int COCA=1;
    public static final int SPRITE=2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito();
        sprite = new Deposito();
        monVu = new DepositoM();
        precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            coca.add(new CocaCola(100+i));
            sprite.add(new Sprite(200+i));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) {
        if (m == null) {
            return null;
        }

        if (m.getValor() < precio || (cual != COCA && cual != SPRITE)) {
            monVu.add(m);
            return null;
        }

        Bebida temp = null;

        switch (cual) {
            case COCA:
                temp = coca.get();
                break;
            case SPRITE:
                temp = sprite.get();
                break;
        }

        if (temp == null) {
            monVu.add(m);
            return null;
        }

        int howManyCoins = (m.getValor() - precio) / 100;
        for (int i = 0; i < howManyCoins; i++) {
            monVu.add(new Moneda100());
        }

        return temp;
    }

    public Moneda getVuelto() {
        return monVu.get();
    }
}
