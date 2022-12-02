package com.javafundamentals.store.basket.repository;

import com.javafundamentals.store.basket.model.Basket;
import com.javafundamentals.store.exception.SQLQueryException;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface BasketRepository {

    List<Basket> getAll(final UUID userId) throws SQLQueryException;

    Optional<Basket> add(final Basket basket) throws SQLQueryException;

    void delete(final UUID productId, final UUID userId) throws SQLQueryException;

}
