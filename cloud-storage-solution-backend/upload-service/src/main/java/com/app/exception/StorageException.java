package com.app.exception;

public class StorageException extends RuntimeException {

    public StorageException(Exception ex) {
        super(ex);
    }
}