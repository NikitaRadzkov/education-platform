package com.javafundamentals.store.user.service.impl;

import com.javafundamentals.store.common.util.UserDetails;
import com.javafundamentals.store.exception.*;
import com.javafundamentals.store.user.model.SignInRequest;
import com.javafundamentals.store.user.model.User;
import com.javafundamentals.store.user.repository.UserRepository;
import com.javafundamentals.store.user.repository.impl.UserRepositoryImpl;
import com.javafundamentals.store.user.service.UserService;

import java.util.List;
import java.util.UUID;

import static com.javafundamentals.store.common.util.LoggerUtil.LOGGER;
import static com.javafundamentals.store.user.model.enums.UserRole.ADMIN;
import static java.util.logging.Level.INFO;

public class UserServiceImpl implements UserService {

    private final UserRepository userRepository = new UserRepositoryImpl();

    @Override
    public void signup(final User user) throws UserAlreadyExistsException, SQLQueryException {
        var isExist = userRepository.getByEmail(user.getEmail()).isPresent();
        if (isExist) {
            throw new UserAlreadyExistsException(user.getEmail());
        }
        userRepository.save(user);
        LOGGER.log(INFO, "Finished signing up.");
    }

    @Override
    public void signin(final SignInRequest signInRequest)
            throws UserIsNotExistException, InvalidPasswordException, SQLQueryException {
        var user = userRepository.getByEmail(signInRequest.getEmail()).orElseThrow(() ->
                new UserIsNotExistException(signInRequest.getEmail()));
        if (!user.getPassword().equals(signInRequest.getPassword())) {
            throw new InvalidPasswordException();
        }
        UserDetails.setCurrentUser(user);
        LOGGER.log(INFO, "Finished signing in.");
    }

    @Override
    public void signout() {
        UserDetails.signout();
        LOGGER.log(INFO, "Finished signing out.");
    }

    @Override
    public User update(final User user) throws SQLQueryException {
        userRepository.update(user);
        LOGGER.log(INFO, "Finished updating user.");
        return user;
    }

    @Override
    public List<User> getAll() throws SQLQueryException {
        var users = userRepository.getAll();
        LOGGER.log(INFO, "Finished getting all users.");
        return users;
    }

    @Override
    public void delete(final UUID id)
            throws UserIsNotExistException, DeleteAdminException, SQLQueryException {
        var user = userRepository.getById(id).orElseThrow(() -> new UserIsNotExistException(id));
        if (user.getRole().equals(ADMIN)) {
            throw new DeleteAdminException();
        }
        userRepository.delete(id);
        LOGGER.log(INFO, "Finished deleting user.");
    }

}
