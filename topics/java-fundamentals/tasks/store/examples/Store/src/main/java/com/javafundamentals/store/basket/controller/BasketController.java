package com.javafundamentals.store.basket.controller;

import com.javafundamentals.store.basket.service.BasketService;
import com.javafundamentals.store.basket.service.impl.BasketServiceImpl;
import com.javafundamentals.store.basket.view.BasketInputView;
import com.javafundamentals.store.basket.view.BasketOutputView;
import com.javafundamentals.store.exception.ProductIsNotExistException;
import com.javafundamentals.store.exception.SQLQueryException;

public class BasketController {

    private final BasketService basketService = new BasketServiceImpl();

    private final BasketInputView basketInputView = new BasketInputView();
    private final BasketOutputView basketOutputView = new BasketOutputView();

    public void getAllProducts() throws SQLQueryException {
        var products = basketService.getAllProductsIds();
        basketOutputView.getAllProducts(products);
    }

    public void addProduct() throws ProductIsNotExistException, SQLQueryException {
        var productId = basketInputView.add();
        basketService.addProductById(productId);
    }

    public void deleteProduct() throws SQLQueryException, ProductIsNotExistException {
        var productId = basketInputView.delete();
        basketService.deleteProductById(productId);
    }

}
