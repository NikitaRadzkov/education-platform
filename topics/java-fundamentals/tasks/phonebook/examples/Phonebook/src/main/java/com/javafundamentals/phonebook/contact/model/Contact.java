package com.javafundamentals.phonebook.contact.model;

import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact {

    private UUID id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private Instant createdAt;

    public String parseToString(final Contact contact) {
        return String.format("%s - %s - %s - %s - %s\n",
                contact.getId(), contact.getFirstName(), contact.getLastName(), contact.getPhoneNumber(), contact.getCreatedAt());
    }

}
