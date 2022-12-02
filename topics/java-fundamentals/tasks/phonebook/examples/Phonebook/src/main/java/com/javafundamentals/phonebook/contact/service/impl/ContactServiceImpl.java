package com.javafundamentals.phonebook.contact.service.impl;

import com.javafundamentals.phonebook.contact.model.Contact;
import com.javafundamentals.phonebook.contact.service.ContactService;
import com.javafundamentals.phonebook.exception.ContactNotExistsException;
import com.javafundamentals.phonebook.exception.FileException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.javafundamentals.phonebook.common.util.LoggerUtil.LOGGER;
import static java.nio.charset.StandardCharsets.UTF_8;
import static java.util.logging.Level.INFO;

public class ContactServiceImpl implements ContactService {

    private static final String FILE_PATH = "src/main/resources/phonebook.txt";

    @Override
    public Contact add(final Contact contact) throws FileException {
        try {
            var fileWriter = new FileWriter(FILE_PATH, true);
            fileWriter.write(contact.parseToString(contact));
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new FileException();
        }
        LOGGER.log(INFO, "Finished adding contact.");
        return contact;
    }

    @Override
    public Contact update(final Contact contactToUpdate) throws ContactNotExistsException, FileException {
        var contactsAsString = readFromFile();
        var contacts = parseToContact(contactsAsString);
        var updatedContacts = contacts.stream()
                .filter(contact -> contact.getId().equals(contactToUpdate.getId()))
                .peek(contact -> {
                    contact.setFirstName(contactToUpdate.getFirstName());
                    contact.setLastName(contactToUpdate.getLastName());
                    contact.setPhoneNumber(contactToUpdate.getPhoneNumber());
                })
                .collect(Collectors.toList());
        if (updatedContacts.size() == 0) {
            throw new ContactNotExistsException(contactToUpdate.getId());
        }
        var updatedContactsAsString = parseToString(contacts);
        try {
            var fileWriter = new FileWriter(FILE_PATH, false);
            fileWriter.write(updatedContactsAsString);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new FileException();
        }
        LOGGER.log(INFO, "Finished updating contact.");
        return contactToUpdate;
    }

    @Override
    public void delete(final UUID id) throws ContactNotExistsException, FileException {
        var contactsAsString = readFromFile();
        var contacts = parseToContact(contactsAsString);
        var newContacts = contacts.stream()
                .filter(contact -> !contact.getId().equals(id))
                .collect(Collectors.toList());

        if (contacts.size() == newContacts.size()) {
            throw new ContactNotExistsException(id);
        }
        var deleteContactsAsString = parseToString(newContacts);
        try {
            var fileWriter = new FileWriter(FILE_PATH, false);
            fileWriter.write(deleteContactsAsString);
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            throw new FileException();
        }
        LOGGER.log(INFO, "Finished deleting contact.");
    }

    @Override
    public List<Contact> getAll() throws FileException {
        var contactsAsString = readFromFile();
        return parseToContact(contactsAsString);
    }

    private List<String> readFromFile() throws FileException {
        List<String> fileVal;
        try {
            fileVal = Files.readAllLines(Paths.get(FILE_PATH), UTF_8);
        } catch (IOException e) {
            throw new FileException();
        }
        LOGGER.log(INFO, "Finished getting all contact.");
        return fileVal;
    }

    private List<Contact> parseToContact(final List<String> fileInfo) {
        var contacts = new ArrayList<Contact>();
        fileInfo.forEach(line -> {
            var contact = new Contact();
            var contactVal = line.split(" - ");
            contact.setId(UUID.fromString(contactVal[0]));
            contact.setFirstName(contactVal[1]);
            contact.setLastName(contactVal[2]);
            contact.setPhoneNumber(contactVal[3]);
            contact.setCreatedAt(Instant.parse(contactVal[4]));
            contacts.add(contact);
        });
        return contacts;
    }

    private String parseToString(final List<Contact> contacts) {
        var contactsAsString = new ArrayList<String>();
        contacts.forEach(contact -> {
            var line = contact.parseToString(contact);
            contactsAsString.add(line);
        });
        var stringBuffer = new StringBuilder();
        for (var line : contactsAsString) {
            stringBuffer.append(line);
        }
        return stringBuffer.toString();
    }

}
