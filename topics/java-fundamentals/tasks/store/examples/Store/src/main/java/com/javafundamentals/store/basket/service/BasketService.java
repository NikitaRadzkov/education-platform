package com.javafundamentals.store.basket.service;

import com.javafundamentals.store.basket.model.Basket;
import com.javafundamentals.store.exception.ProductIsNotExistException;
import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.model.Product;

import java.util.List;
import java.util.UUID;

public interface BasketService {

    List<Product> getAllProductsIds() throws SQLQueryException;

    Basket addProductById(final UUID productId)
            throws SQLQueryException, ProductIsNotExistException;

    void deleteProductById(final UUID productId) throws SQLQueryException, ProductIsNotExistException;

}
