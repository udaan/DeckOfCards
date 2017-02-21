package com.ghtl.cards.exceptions;

/**
 * Exception class in case of Invalid Cards
 */
public class InvalidCardException extends Exception {
    static final long serialVersionUID = -687991492884005033L;

    public InvalidCardException() {
        super();
    }

    public InvalidCardException(String message) {
        super(message);
    }

    public InvalidCardException(Throwable cause) {
        super(cause);
    }

    public InvalidCardException(String message, Throwable cause) {
        super(message, cause);
    }

    protected InvalidCardException(String message, Throwable cause,
                                   boolean enableSuppression,
                                   boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}