package org.example;

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
