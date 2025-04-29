package org.example;

class Comprador {
    private String sonido = "";
    private int vuelto = 0;

    public Comprador(Moneda m, Expendedor.Productos cualProducto, Expendedor exp) {
        Producto p = null;
        try {
            p = exp.comprarProducto(m, cualProducto);
        } catch (NoHayProductoException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PagoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (PagoIncorrectoException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        if (p == null) {
            Moneda monedaTemporal = exp.getVuelto();
            if (monedaTemporal != null) {
                vuelto = monedaTemporal.getValor();
            }
            return;
        }
        sonido = p.consumir();

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

    public String queConsumiste() {
        return sonido;
    }
}
