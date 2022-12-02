package com.javafundamentals.store.user.repository.impl;

import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.user.model.User;
import com.javafundamentals.store.user.model.enums.UserRole;
import com.javafundamentals.store.user.repository.UserRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.javafundamentals.store.common.util.JdbcConnection.*;

public class UserRepositoryImpl implements UserRepository {

    private final static String CREATE_QUERY =
            "INSERT INTO \"user\" (id, first_name, last_name, role, email, password) VALUES (?, ?, ?, ?, ?, ?);";
    private final static String UPDATE_QUERY =
            "UPDATE \"user\" SET first_name = ?, last_name = ?, role = ?, email = ?, password = ? WHERE id = ?;";
    private final static String GET_BY_EMAIL_QUERY = "SELECT * FROM \"user\" WHERE email = ?;";
    private final static String GET_BY_ID_QUERY = "SELECT * FROM \"user\" WHERE id = ?;";
    private final static String GET_ALL_QUERY = "SELECT * FROM \"user\";";
    private final static String DELETE_QUERY = "DELETE FROM \"user\" WHERE id = ?;";

    @Override
    public void save(final User user) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CREATE_QUERY);
            statement.setObject(1, UUID.randomUUID());
            statement.setString(2, user.getFirstName());
            statement.setString(3, user.getLastName());
            statement.setString(4, user.getRole().name());
            statement.setString(5, user.getEmail());
            statement.setString(6, user.getPassword());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public Optional<User> getByEmail(final String emailFromRequest) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Optional<User> user = Optional.empty();
        try {
            statement = connection.prepareStatement(GET_BY_EMAIL_QUERY);
            statement.setString(1, emailFromRequest);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var firstName = resultSet.getString("first_name");
                var lastName = resultSet.getString("last_name");
                var role = resultSet.getString("role");
                var email = resultSet.getString("email");
                var password = resultSet.getString("password");
                user = Optional.of(new User(UUID.fromString(id.toString()), firstName, lastName, UserRole.valueOf(role), email, password));
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return user;
    }

    @Override
    public Optional<User> getById(final UUID searchUserId) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Optional<User> user = Optional.empty();
        try {
            statement = connection.prepareStatement(GET_BY_ID_QUERY);
            statement.setObject(1, searchUserId);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var firstName = resultSet.getString("first_name");
                var lastName = resultSet.getString("last_name");
                var role = resultSet.getString("role");
                var email = resultSet.getString("email");
                var password = resultSet.getString("password");
                user = Optional.of(new User(UUID.fromString(id.toString()), firstName, lastName, UserRole.valueOf(role), email, password));
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return user;
    }

    @Override
    public Optional<User> update(final User user) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE_QUERY);
            statement.setString(1, user.getFirstName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getRole().name());
            statement.setString(4, user.getEmail());
            statement.setString(5, user.getPassword());
            statement.setObject(6, user.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
        return Optional.of(user);
    }

    @Override
    public void delete(final UUID id) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE_QUERY);
            statement.setObject(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public List<User> getAll() throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList<>();
        try {
            statement = connection.prepareStatement(GET_ALL_QUERY);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var firstName = resultSet.getString("first_name");
                var lastName = resultSet.getString("last_name");
                var role = resultSet.getString("role");
                var email = resultSet.getString("email");
                var password = resultSet.getString("password");
                var user = new User(UUID.fromString(id.toString()), firstName, lastName, UserRole.valueOf(role), email, password);
                users.add(user);
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return users;
    }

}
