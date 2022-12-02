package com.javafundamentals.store.user.service;

import com.javafundamentals.store.exception.*;
import com.javafundamentals.store.user.model.SignInRequest;
import com.javafundamentals.store.user.model.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    void signup(final User user) throws UserAlreadyExistsException, SQLQueryException;

    void signin(final SignInRequest signInRequest) throws UserIsNotExistException, InvalidPasswordException, SQLQueryException;

    void signout();

    User update(final User user) throws SQLQueryException;

    List<User> getAll() throws SQLQueryException;

    void delete(final UUID id) throws UserIsNotExistException, DeleteAdminException, SQLQueryException;

}
