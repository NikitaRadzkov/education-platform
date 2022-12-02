package com.javafundamentals.phonebook.contact.service;

import com.javafundamentals.phonebook.contact.model.Contact;
import com.javafundamentals.phonebook.exception.ContactNotExistsException;
import com.javafundamentals.phonebook.exception.FileException;

import java.util.List;
import java.util.UUID;

public interface ContactService {

    Contact add(final Contact contact) throws FileException;

    Contact update(final Contact contact) throws ContactNotExistsException, FileException;

    void delete(final UUID id) throws ContactNotExistsException, FileException;

    List<Contact> getAll() throws FileException;

}
