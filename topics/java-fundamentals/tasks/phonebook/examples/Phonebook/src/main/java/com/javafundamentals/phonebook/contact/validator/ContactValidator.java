package com.javafundamentals.phonebook.contact.validator;

import com.javafundamentals.phonebook.contact.model.Contact;
import com.javafundamentals.phonebook.exception.InvalidInputException;

public class ContactValidator {

    private final static String NAME_PATTERN = "[A-Za-z]+";
    private final static String PHONE_NUMBER_PATTERN = "[-+\\d]+";

    public void validate(final Contact contact) throws InvalidInputException {
        var firstName = contact.getFirstName();
        var lastName = contact.getLastName();
        if (!firstName.matches(NAME_PATTERN) || !lastName.matches(NAME_PATTERN)) {
            throw new InvalidInputException();
        }
        var phoneNumber = contact.getPhoneNumber();
        if (!phoneNumber.matches(PHONE_NUMBER_PATTERN)) {
            throw new InvalidInputException();
        }

    }

}
