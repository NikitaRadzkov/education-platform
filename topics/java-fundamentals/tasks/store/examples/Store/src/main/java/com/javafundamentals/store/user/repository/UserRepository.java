package com.javafundamentals.store.user.repository;

import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.user.model.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {

    void save(final User user) throws SQLQueryException;

    Optional<User> getByEmail(final String email) throws SQLQueryException;

    Optional<User> getById(final UUID id) throws SQLQueryException;

    Optional<User> update(final User user) throws SQLQueryException;

    void delete(final UUID id) throws SQLQueryException;

    List<User> getAll() throws SQLQueryException;


}
