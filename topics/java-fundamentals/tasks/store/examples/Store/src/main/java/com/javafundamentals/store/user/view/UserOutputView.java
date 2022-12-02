package com.javafundamentals.store.user.view;

import com.javafundamentals.store.user.model.User;

import java.util.List;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;

public class UserOutputView {

    public void showProfile(User user) {
        System.out.println();
        System.out.println("U S E R   P R O F I L E");
        System.out.println(DIVIDING_STRIP);
        System.out.println("N A M E | " + user.getFirstName() + " " + user.getLastName());
        System.out.println("R O L E | " + user.getRole());
        System.out.println("E M A I L | " + user.getEmail());
        System.out.println();
    }

    public void showAllProfile(List<User> users) {
        System.out.println();
        System.out.println("U S E R S   P R O F I L E");
        System.out.println(DIVIDING_STRIP);
        if (users.size() == 0) {
            System.out.println(" No users");
            System.out.println();
        }
        users.forEach(user -> {
            System.out.println("I D | " + user.getId());
            System.out.println("N A M E | " + user.getFirstName() + " " + user.getLastName());
            System.out.println("R O L E | " + user.getRole());
            System.out.println("E M A I L | " + user.getEmail());
            System.out.println(DIVIDING_STRIP);
        });
    }

}
