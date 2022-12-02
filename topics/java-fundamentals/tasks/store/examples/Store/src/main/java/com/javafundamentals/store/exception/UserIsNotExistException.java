package com.javafundamentals.store.exception;

import java.util.UUID;

public class UserIsNotExistException extends Exception {

    public UserIsNotExistException(String email) {

        super(String.format("User with such email %s does not exist!", email));

    }

    public UserIsNotExistException(UUID id) {

        super(String.format("User with such id %s does not exist!", id));

    }

}
