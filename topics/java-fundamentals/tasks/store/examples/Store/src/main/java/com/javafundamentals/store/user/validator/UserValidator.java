package com.javafundamentals.store.user.validator;

import com.javafundamentals.store.exception.InvalidInputException;
import com.javafundamentals.store.user.model.SignInRequest;
import com.javafundamentals.store.user.model.User;

public class UserValidator {

    private final static String NAME_PATTERN = "[A-Za-z]+";
    private final static String EMAIL_PATTERN = "^(.+)@(.+)$";
    private final static String PASSWORD_PATTERN = "[\\w]{5,}";
    private final static String INVALID_INPUT_EXCEPTION_MESSAGE = "Invalid %s field!\n";

    public boolean validate(final User user) throws InvalidInputException {
        String exceptionMessage = "";
        if (!user.getFirstName().matches(NAME_PATTERN)) {
            exceptionMessage = exceptionMessage.concat(String.format(INVALID_INPUT_EXCEPTION_MESSAGE, "first name"));
        }
        if (!user.getLastName().matches(NAME_PATTERN)) {
            exceptionMessage = exceptionMessage.concat(String.format(INVALID_INPUT_EXCEPTION_MESSAGE, "last name"));
        }
        if (!user.getEmail().matches(EMAIL_PATTERN)) {
            exceptionMessage = exceptionMessage.concat(String.format(INVALID_INPUT_EXCEPTION_MESSAGE, "email"));
        }
        if (!user.getPassword().matches(PASSWORD_PATTERN)) {
            exceptionMessage = exceptionMessage.concat(String.format(INVALID_INPUT_EXCEPTION_MESSAGE, "password"));
        }
        if (!exceptionMessage.equals("")) {
            throw new InvalidInputException(exceptionMessage);
        }
        return true;
    }

    public boolean validate(final SignInRequest signInRequest) throws InvalidInputException {
        String exceptionMessage = "";
        if (!signInRequest.getEmail().matches(EMAIL_PATTERN)) {
            exceptionMessage = exceptionMessage.concat(String.format(INVALID_INPUT_EXCEPTION_MESSAGE, "first name"));
        }
        if (!exceptionMessage.equals("")) {
            throw new InvalidInputException(exceptionMessage);
        }
        return true;

    }

}
