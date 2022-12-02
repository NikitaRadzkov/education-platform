package com.javafundamentals.store.user.model;

import com.javafundamentals.store.user.model.enums.UserRole;
import lombok.*;

import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private UUID id;

    private String firstName;

    private String lastName;

    private UserRole role;

    private String email;

    private String password;

}
