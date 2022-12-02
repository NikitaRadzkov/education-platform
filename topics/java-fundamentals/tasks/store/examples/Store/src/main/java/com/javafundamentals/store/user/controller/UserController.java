package com.javafundamentals.store.user.controller;

import com.javafundamentals.store.common.util.UserDetails;
import com.javafundamentals.store.exception.*;
import com.javafundamentals.store.user.service.UserService;
import com.javafundamentals.store.user.service.impl.UserServiceImpl;
import com.javafundamentals.store.user.view.UserInputView;
import com.javafundamentals.store.user.view.UserOutputView;

public class UserController {

    private final UserService userService = new UserServiceImpl();

    private final UserInputView userInputView = new UserInputView();
    private final UserOutputView userOutputView = new UserOutputView();

    public void signup() throws UserAlreadyExistsException, SQLQueryException {
        var user = userInputView.createUser();
        userService.signup(user);
    }

    public void signin() throws UserIsNotExistException, InvalidPasswordException, SQLQueryException {
        var signInRequest = userInputView.createSigninRequest();
        userService.signin(signInRequest);
    }

    public void signout() {
        userService.signout();
    }

    public void getCurrentUser() {
        var user = UserDetails.getCurrentUserOrNull();
        userOutputView.showProfile(user);
    }

    public void getAllUsers() throws SQLQueryException {
        var users = userService.getAll();
        userOutputView.showAllProfile(users);
    }

    public void updateCurrentUser() throws SQLQueryException {
        var user = userInputView.createUser();
        var currentUser = UserDetails.getCurrentUserOrNull();
        user.setId(currentUser.getId());
        user.setRole(currentUser.getRole());
        var updatedUser = userService.update(user);
        UserDetails.setCurrentUser(updatedUser);
    }

    public void updateUser() throws SQLQueryException {
        var userId = userInputView.getUserId();
        var user = userInputView.createUser();
        user.setId(userId);
        userService.update(user);
    }

    public void deleteCurrentUser() throws DeleteAdminException, SQLQueryException, UserIsNotExistException {
        var currentUser = UserDetails.getCurrentUserOrNull();
        userService.delete(currentUser.getId());
    }

    public void deleteUser() throws UserIsNotExistException, DeleteAdminException, SQLQueryException {
        var userId = userInputView.getUserId();
        userService.delete(userId);
    }

}
