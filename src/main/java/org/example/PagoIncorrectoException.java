package org.example;

public class PagoIncorrectoException extends Exception {
    /**
     * Excepción que surge cuando se utiliza una moneda null para intentar comprar un producto
     * @param message: Mensaje personalizado para la excepción
     */
    public PagoIncorrectoException(String message) {
        super(message);
    }
}
