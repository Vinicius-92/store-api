package com.store.storeapi.exceptions;

public class StoreException extends RuntimeException {

    private String message;

    public StoreException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
