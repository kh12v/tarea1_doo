package org.example;

import java.util.ArrayList;

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

class Comprador {
    private String sonido;
    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        if (m == null) {
            return;
        }

        Bebida b = exp.comprarBebida(m, cualBebida);
        if (b == null) {
            vuelto = exp.getVuelto().getValor();
            return;
        }
        sonido = b.beber();

        Moneda mVuelto = exp.getVuelto();

        vuelto = 0;
        while (mVuelto != null) {
            vuelto = vuelto + mVuelto.getValor();
            mVuelto = exp.getVuelto();
        }
    }

    public int cuantoVuelto() {
        return vuelto;
    }

    public String queBebiste() {
        return sonido;
    }
}

abstract class Moneda {
    public Moneda() {}

    public Moneda getSerie() {
        return this;
    }

    public abstract int getValor();
}

class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    public int getValor() {
        return 1000;
    }
}

class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }

    public int getValor() {
        return 500;
    }
}

class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }

    public int getValor() {
        return 100;
    }
}

class Moneda1500 extends Moneda {
    public Moneda1500() {
        super();
    }

    public int getValor() {
        return 1500;
    }
}

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

class CocaCola extends Bebida {
    public CocaCola(int numSerie) {
        super(numSerie);
    }

    public String beber() {
        return "cocacola";
    }
}

class Sprite extends Bebida {
    public Sprite(int numSerie) {
        super(numSerie);
    }

    public String beber() {
        return "sprite";
    }
}

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

public class Main {
    public static void main(String[] args) {
        Expendedor exp = new Expendedor(2, 100);

        // Comprar con vuelto
        Comprador c = new Comprador(new Moneda500(), Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Codigo de usuario 1
        c = new Comprador(new Moneda1000(), Expendedor.COCA, exp);
        System.out.println(c.toString());

        // Comprar sin vuelto
        c = new Comprador(new Moneda100(), Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin bebidas
        c = new Comprador(new Moneda1000(), Expendedor.COCA, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar sin moneda
        c = new Comprador(null, Expendedor.SPRITE, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());

        // Comprar bebida no existente
        c = new Comprador(new Moneda1000(), 3, exp);
        System.out.println("Bebida: " + c.queBebiste() + "; Vuelto: " + c.cuantoVuelto());
    }
}