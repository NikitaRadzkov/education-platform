package com.javafundamentals.store.exception;

public class UserAlreadyExistsException extends Exception {

    public UserAlreadyExistsException(String email) {

        super(String.format("User with such email %s is already exist!", email));

    }

}
