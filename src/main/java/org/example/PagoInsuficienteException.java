package org.example;

public class PagoInsuficienteException extends Exception {
    /**
     * Excepción qe surje cuando se intenta comprar un producto con una moneda de valor inferior
     * al precio del producto
     * @param message: Mensaje personalizado para la excepción
     */
    public PagoInsuficienteException(String message) {
        super(message);
    }
}
