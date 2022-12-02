package com.javafundamentals.store.product.repository.impl;

import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.model.Product;
import com.javafundamentals.store.product.repository.ProductRepository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import static com.javafundamentals.store.common.util.JdbcConnection.*;

public class ProductRepositoryImpl implements ProductRepository {

    private final static String CREATE_QUERY =
            "INSERT INTO product (id, name, price, description) VALUES (?, ?, ?, ?);";
    private final static String UPDATE_QUERY =
            "UPDATE product SET name = ?, price = ?, description = ? WHERE id = ?;";
    private final static String DELETE_QUERY = "DELETE FROM product WHERE id = ?;";
    private final static String GET_BY_ID_QUERY = "SELECT * FROM product WHERE id = ?;";
    private final static String GET_ALL_QUERY = "SELECT * FROM product;";
    private final static String GET_ALL_BY_ID_QUERY = "SELECT * FROM product WHERE id = ANY (?);";

    @Override
    public Optional<Product> getById(final UUID productId) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        Optional<Product> product = Optional.empty();
        try {
            statement = connection.prepareStatement(GET_BY_ID_QUERY);
            statement.setObject(1, productId);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var name = resultSet.getString("name");
                var price = resultSet.getFloat("price");
                var description = resultSet.getString("description");
                product = Optional.of(new Product(UUID.fromString(id.toString()), name, price, description));
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return product;
    }

    @Override
    public void save(final Product product) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(CREATE_QUERY);
            statement.setObject(1, UUID.randomUUID());
            statement.setString(2, product.getName());
            statement.setFloat(3, product.getPrice());
            statement.setString(4, product.getDescription());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
    }

    @Override
    public void update(final Product product) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(UPDATE_QUERY);
            statement.setString(1, product.getName());
            statement.setFloat(2, product.getPrice());
            statement.setString(3, product.getDescription());
            statement.setObject(4, product.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, null);
        }
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
    public List<Product> getAllById(final List<UUID> ids) throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        var products = new ArrayList<Product>();
        try {
            statement = connection.prepareStatement(GET_ALL_BY_ID_QUERY);
            var idsInArray = connection.createArrayOf("UUID", ids.toArray());
            statement.setArray(1, idsInArray);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var name = resultSet.getString("name");
                var price = resultSet.getFloat("price");
                var description = resultSet.getString("description");
                var product = new Product(UUID.fromString(id.toString()), name, price, description);
                products.add(product);
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return products;
    }

    @Override
    public List<Product> getAll() throws SQLQueryException {
        var connection = getConnection();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        var products = new ArrayList<Product>();
        try {
            statement = connection.prepareStatement(GET_ALL_QUERY);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                var id = resultSet.getObject("id");
                var name = resultSet.getString("name");
                var price = resultSet.getFloat("price");
                var description = resultSet.getString("description");
                var product = new Product(UUID.fromString(id.toString()), name, price, description);
                products.add(product);
            }
        } catch (SQLException e) {
            throw new SQLQueryException();
        } finally {
            closeConnection(connection, statement, resultSet);
        }
        return products;
    }

}
