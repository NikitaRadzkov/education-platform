package com.javafundamentals.store.product.service;

import com.javafundamentals.store.exception.ProductIsNotExistException;
import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.model.Product;

import java.util.List;
import java.util.UUID;


public interface ProductService {

    void create(final Product product) throws SQLQueryException;

    void update(final Product product) throws ProductIsNotExistException, SQLQueryException;

    void delete(final UUID id) throws ProductIsNotExistException, SQLQueryException;

    boolean isExistById(final UUID id) throws ProductIsNotExistException, SQLQueryException;

    List<Product> getAll() throws SQLQueryException;

    List<Product> getByIds(final List<UUID> ids) throws SQLQueryException;

}
