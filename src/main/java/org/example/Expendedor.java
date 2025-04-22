package org.example;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private DepositoM monVu;
    private int precio;

    public static final int COCA=1;
    public static final int SPRITE=2;

    public Expendedor(int numBebidas, int precioBebidas) {
        coca = new Deposito<Bebida>();
        sprite = new Deposito<Bebida>();
        fanta = new Deposito<Bebida>();

        snickers = new Deposito<Dulce>();
        super8 = new Deposito<Dulce>();

        monVu = new DepositoM();
        precio = precioBebidas;

        for (int i = 0; i < numBebidas; i++) {
            coca.add(     new CocaCola( (i*5)+0 ));
            sprite.add(   new Sprite( (i*5)+1   ));
            fanta.add(    new Fanta( (i*5)+2    ));
            snickers.add( new Snickers( (i*5)+3 ));
            super8.add(   new Super8( (i*5)+4   ));
        }
    }

    public Bebida comprarBebida(Moneda m, int cual) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
        if (m == null) {
            throw new PagoIncorrectoException("Debe ingresar una moneda");
        }

        // No alcanza saldo
        if (m.getValor() < precio) {
            monVu.add(m);
            throw new PagoInsuficienteException("Pago insuficiente");
        }

        Producto temp = null;

        switch (cual) {
            case COCA:
                temp = coca.get();
                break;
            case SPRITE:
                temp = sprite.get();
                break;
            default:
                throw new NoHayProductoException("No existe producto solicitado");
        }

        // No hay producto solicitado
        if (temp == null) {
            monVu.add(m);
            throw new NoHayProductoException("No hay producto solicitado");
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
