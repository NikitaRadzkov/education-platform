package com.javafundamentals.store.exception;

public class InvalidPasswordException extends Exception {

    public InvalidPasswordException() {

        super("Password is invalid!");

    }

}
