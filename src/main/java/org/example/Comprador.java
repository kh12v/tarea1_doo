package org.example;

class Comprador {
    private String sonido = "";
    private int vuelto = 0;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        Bebida b = null;
        try {
            b = exp.comprarBebida(m, cualBebida);
        } catch (NoHayProductoException e) {
            // TODO: Remove log
            System.out.println("Error: " + e.getMessage());
        } catch (PagoInsuficienteException e) {
            // TODO: Remove log
            System.out.println("Error: " + e.getMessage());
        } catch (PagoIncorrectoException e) {
            // TODO: Remove log
            System.out.println("Error: " + e.getMessage());
            return;
        }

        if (b == null) {
            Moneda monedaTemporal = exp.getVuelto();
            if (monedaTemporal != null) {
                vuelto = monedaTemporal.getValor();
            }
            return;
        }
        sonido = b.consumir();

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
