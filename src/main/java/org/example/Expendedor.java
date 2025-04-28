package org.example;

class Expendedor {
    private Deposito<Bebida> coca;
    private Deposito<Bebida> sprite;
    private Deposito<Bebida> fanta;
    private Deposito<Dulce> snickers;
    private Deposito<Dulce> super8;
    private Deposito<Moneda> monVu;
    private int precio;

    public enum Productos {
        COCA, SPRITE, FANTA, SNICKERS, SUPER8
    }

    public Expendedor(int numProductos, int precioProductos) {
        coca = new Deposito<>();
        sprite = new Deposito<>();
        fanta = new Deposito<>();

        snickers = new Deposito<>();
        super8 = new Deposito<>();

        monVu = new Deposito<>();
        precio = precioProductos;

        for (int i = 0; i < numProductos; i++) {
            coca.add(     new CocaCola( (i*5)+0 ));
            sprite.add(   new Sprite( (i*5)+1   ));
            fanta.add(    new Fanta( (i*5)+2    ));
            snickers.add( new Snickers( (i*5)+3 ));
            super8.add(   new Super8( (i*5)+4   ));
        }
    }

    public Producto comprarProducto(Moneda m, Productos cual) throws NoHayProductoException, PagoInsuficienteException, PagoIncorrectoException {
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
            case FANTA:
                temp = fanta.get();
                break;
            case SNICKERS:
                temp = snickers.get();
                break;
            case SUPER8:
                temp = super8.get();
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
