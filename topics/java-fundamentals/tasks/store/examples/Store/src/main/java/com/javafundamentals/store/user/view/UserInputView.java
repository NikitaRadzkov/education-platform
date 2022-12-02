package com.javafundamentals.store.user.view;

import com.javafundamentals.store.exception.InvalidInputException;
import com.javafundamentals.store.user.model.SignInRequest;
import com.javafundamentals.store.user.model.User;
import com.javafundamentals.store.user.validator.UserValidator;

import java.util.UUID;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;
import static com.javafundamentals.store.common.util.Constants.SCANNER;
import static com.javafundamentals.store.user.model.enums.UserRole.USER;

public class UserInputView {

    private final UserValidator userValidator = new UserValidator();

    public User createUser() {
        System.out.println();
        System.out.println("U S E R   C R E A T I O N");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter first name -");
        var firstName = SCANNER.nextLine();
        System.out.println("- Enter last name -");
        var lastName = SCANNER.nextLine();
        System.out.println("- Enter email -");
        var email = SCANNER.nextLine();
        System.out.println("- Enter password -");
        var password = SCANNER.nextLine();
        var user =  new User(null, firstName, lastName, USER, email, password);
        try {
            userValidator.validate(user);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            user = createUser();
        }
        return user;
    }

    public SignInRequest createSigninRequest() {
        System.out.println();
        System.out.println("S I G N   I N");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter email -");
        var email = SCANNER.nextLine();
        System.out.println("- Enter password -");
        var password = SCANNER.nextLine();
        return new SignInRequest(email, password);
    }

    public UUID getUserId() {
        System.out.println();
        System.out.println("E N T E R   U S E R   I D");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter id -");
        var id = SCANNER.nextLine();
        return UUID.fromString(id);
    }

}
