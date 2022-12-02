package com.javafundamentals.store.basket.repository.impl;

import com.javafundamentals.store.basket.model.Basket;
import com.javafundamentals.store.basket.repository.BasketRepository;
import com.javafundamentals.store.exception.SQLQueryException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.javafundamentals.store.common.util.JdbcConnection.*;
import static com.javafundamentals.store.common.util.JdbcConnection.closeConnection;

public class BasketRepositoryImpl implements BasketRepository {

    private final static String INSERT_QUERY = "INSERT INTO basket (id, user_id, product_id) VALUES (?, ?, ?);";
    private final static String GET_BY_USER_ID_QUERY = "SELECT * FROM basket WHERE user_id = ?;";
    private final static String DELETE_QUERY = "DELETE FROM basket WHERE product_id = ? AND user_id = ?;";

    @Override
    public List<Basket> getAll(final UUID currentUserId) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        var baskets = new ArrayList<Basket>();
        try {
            statement = connection.prepareStatement(GET_BY_USER_ID_QUERY);
            statement.setObject(1, currentUserId);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var userId = resultSet.getObject("user_id");
                var productId = resultSet.getObject("product_id");
                var basket = new Basket(UUID.fromString(id.toString()), UUID.fromString(userId.toString()), UUID.fromString(productId.toString()));
                baskets.add(basket);
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return baskets;
    }

    @Override
    public Optional<Basket> add(final Basket basket) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(INSERT_QUERY);
            statement.setObject(1, UUID.randomUUID());
            statement.setObject(2, basket.getUserId());
            statement.setObject(3, basket.getProductId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
        return Optional.of(basket);
    }

    @Override
    public void delete(final UUID productId, final UUID userId) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(DELETE_QUERY);
            statement.setObject(1, productId);
            statement.setObject(2, userId);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
    }

}
