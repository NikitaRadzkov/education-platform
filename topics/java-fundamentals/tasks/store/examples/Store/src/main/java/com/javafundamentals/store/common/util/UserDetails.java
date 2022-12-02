package com.javafundamentals.store.common.util;

import com.javafundamentals.store.exception.UserIsNotSignInException;
import com.javafundamentals.store.user.model.User;
import com.javafundamentals.store.user.model.enums.UserRole;

import java.util.Optional;

public class UserDetails {

    private static Optional<User> user = Optional.empty();

    public static void setCurrentUser(User currentUser) {
        user = Optional.of(currentUser);
    }

    public static User getCurrentUserOrNull() {
        return user.orElse(null);
    }

    public static void signout() {
        user = Optional.empty();
    }

    public static boolean isUserSignIn () {
        return user.isPresent();
    }

    public static UserRole getCurrentUserRole() throws UserIsNotSignInException {
        User currentUser = user.orElseThrow(UserIsNotSignInException::new);
        return currentUser.getRole();
    }

}
