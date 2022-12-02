package com.javafundamentals.phonebook.contact.view;

import com.javafundamentals.phonebook.contact.model.Contact;
import com.javafundamentals.phonebook.contact.validator.ContactValidator;
import com.javafundamentals.phonebook.exception.InvalidInputException;

import java.time.Instant;
import java.util.List;
import java.util.UUID;

import static com.javafundamentals.phonebook.common.util.Constants.DIVIDING_STRIP;
import static com.javafundamentals.phonebook.common.util.Constants.SCANNER;

public class ContactView {

    public Contact add() throws InvalidInputException {
        System.out.println();
        System.out.println("A D D   A   N E W   C O N T A C T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("Enter first name");
        var firstName = SCANNER.nextLine();
        System.out.println("Enter last name");
        var lastName = SCANNER.nextLine();
        System.out.println("Enter phone number");
        var phoneNumber = SCANNER.nextLine();

        var contact = new Contact(UUID.randomUUID(), firstName, lastName, phoneNumber, Instant.now());
        var contactValidator = new ContactValidator();
        contactValidator.validate(contact);
        return contact;
    }

    public Contact update() throws InvalidInputException {
        System.out.println();
        System.out.println("U P D A T E   A   C O N T A C T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("Enter contact id");
        var id = SCANNER.nextLine();
        System.out.println("Enter first name");
        var firstName = SCANNER.nextLine();
        System.out.println("Enter last name");
        var lastName = SCANNER.nextLine();
        System.out.println("Enter phone number");
        var phoneNumber = SCANNER.nextLine();

        var contact =  new Contact(UUID.fromString(id), firstName, lastName, phoneNumber, Instant.now());
        var contactValidator = new ContactValidator();
        contactValidator.validate(contact);
        return contact;
    }

    public UUID delete() {
        System.out.println();
        System.out.println("D E L E T E   A   C O N T A C T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("Enter contact id");
        var id = SCANNER.nextLine();
        return UUID.fromString(id);
    }

    public void getAll(final List<Contact> contacts) {
        System.out.println("P H O N E   C O N T A C T S");
        contacts.forEach(contact -> {
            System.out.println(DIVIDING_STRIP);
            System.out.println("I D | " + contact.getId());
            System.out.println("N A M E | " + contact.getFirstName() + " " + contact.getLastName());
            System.out.println("P H O N E   T E L | " + contact.getPhoneNumber());
            System.out.println();
        });
    }

}
