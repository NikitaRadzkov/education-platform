package com.javafundamentals.store.product.controller;

import com.javafundamentals.store.exception.ProductIsNotExistException;
import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.service.ProductService;
import com.javafundamentals.store.product.service.impl.ProductServiceImpl;
import com.javafundamentals.store.product.view.ProductInputView;
import com.javafundamentals.store.product.view.ProductOutputView;

public class ProductController {

    private final ProductService productService = new ProductServiceImpl();

    private final ProductInputView productInputView = new ProductInputView();
    private final ProductOutputView productOutputView = new ProductOutputView();

    public void createProduct() throws SQLQueryException {
        var product = productInputView.create();
        productService.create(product);
        productOutputView.create();
    }

    public void getAllProducts() throws SQLQueryException {
        var products = productService.getAll();
        productOutputView.getAllProducts(products);
    }

    public void updateProduct() throws ProductIsNotExistException, SQLQueryException {
        var product = productInputView.update();
        productService.update(product);
        productOutputView.update();
    }

    public void deleteProduct() throws ProductIsNotExistException, SQLQueryException {
        var productId = productInputView.delete();
        productService.delete(productId);
        productOutputView.delete();
    }

}
