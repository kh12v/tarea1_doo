package org.example;

public class NoHayProductoException extends Exception {
    /**
     * Excepción que surge cuando el producto solicitado se acabó o no existe
     * @param message: Mensaje personalizado para la excepción
     */
    public NoHayProductoException(String message) {
        super(message);
    }
}
