package org.example;

class Comprador {
    private String sonido = "";
    private int vuelto = 0;

    /**
     * Utilizando la moneda y expendedor especificado en el constructor intenta comprar
     * el producto especificado tambien en su constructor.
     * En caso que la compra sea exitosa consume el producto y retira todas las monedas
     * almacenadas como vuelto en el expendedor.
     * El string devuelto al consumir el producto y el valor total del vuelto son
     * almacenados como propiedades dentro de esta clase.
     * En caso que la compra fracase el comprador mostrará un mensaje en pantalla
     * indicando cual es el error retornado por el expendedor
     * @param m: Moneda utilizada para realizar la compra
     * @param cualProducto: EL tipo de producto que se desea comprar
     * @param exp: El expendedor utilizado para la compra y posible retiro del vuelto
     * @see Moneda
     * @see Expendedor
     * @see NoHayProductoException
     * @see PagoInsuficienteException
     * @see PagoIncorrectoException
     */
    public Comprador(Moneda m, Expendedor.Productos cualProducto, Expendedor exp) throws NoHayProductoException, PagoIncorrectoException, PagoInsuficienteException{
        Producto p = null;

        try {
            p = exp.comprarProducto(m, cualProducto);
        } catch (NoHayProductoException | PagoInsuficienteException e) {
            Moneda monedaTemporal = exp.getVuelto();
            if (monedaTemporal != null) {
                vuelto = monedaTemporal.getValor();
                throw e;
            }
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

    /**
     * @return El valor total del vuelto retirado del expendedor
     */
    public int cuantoVuelto() {
        return vuelto;
    }

    /**
     * @return El string devuelto por el producto consumido
     */
    public String queConsumiste() {
        return sonido;
    }
}
