package com.felipecavassana.screenmatch.exception;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String message;
    public ErroDeConversaoDeAnoException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
