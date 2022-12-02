package com.javafundamentals.store.product.repository;

import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


public interface ProductRepository {

    void save(final Product product) throws SQLQueryException;

    List<Product> getAll() throws SQLQueryException;

    Optional<Product> getById(final UUID id) throws SQLQueryException;

    void update(final Product product) throws SQLQueryException;

    void delete(final UUID id) throws SQLQueryException;

    List<Product> getAllById(List<UUID> ids) throws SQLQueryException;

}
