package com.javafundamentals.phonebook.exception;

import java.util.UUID;

public class ContactNotExistsException extends Exception {

    public ContactNotExistsException(UUID id) {
        super(String.format("Contact with such id %s does not exist",id));
    }

}
