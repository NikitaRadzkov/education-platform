package com.javafundamentals.phonebook.contact.controller;

import com.javafundamentals.phonebook.contact.service.ContactService;
import com.javafundamentals.phonebook.contact.service.impl.ContactServiceImpl;
import com.javafundamentals.phonebook.contact.view.ContactView;
import com.javafundamentals.phonebook.exception.ContactNotExistsException;
import com.javafundamentals.phonebook.exception.FileException;
import com.javafundamentals.phonebook.exception.InvalidInputException;

public class ContactController {

    private final ContactService contactService = new ContactServiceImpl();

    private final ContactView contactView = new ContactView();

    public void getAll() throws FileException {
        var contacts = contactService.getAll();
        contactView.getAll(contacts);
    }

    public void add() throws InvalidInputException, FileException {
        var contact = contactView.add();
        contactService.add(contact);
    }

    public void update() throws InvalidInputException, ContactNotExistsException, FileException {
        var contact = contactView.update();
        contactService.update(contact);
    }

    public void delete() throws ContactNotExistsException, FileException {
        var contactId = contactView.delete();
        contactService.delete(contactId);
    }

}
