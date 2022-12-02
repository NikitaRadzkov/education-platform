package com.javafundamentals.store.basket.service.impl;

import com.javafundamentals.store.basket.model.Basket;
import com.javafundamentals.store.basket.repository.BasketRepository;
import com.javafundamentals.store.basket.repository.impl.BasketRepositoryImpl;
import com.javafundamentals.store.basket.service.BasketService;
import com.javafundamentals.store.common.util.UserDetails;
import com.javafundamentals.store.exception.ProductIsNotExistException;
import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.model.Product;
import com.javafundamentals.store.product.service.ProductService;
import com.javafundamentals.store.product.service.impl.ProductServiceImpl;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import static com.javafundamentals.store.common.util.LoggerUtil.LOGGER;
import static java.util.logging.Level.INFO;

public class BasketServiceImpl implements BasketService {

    private final ProductService productService = new ProductServiceImpl();

    private final BasketRepository basketRepository = new BasketRepositoryImpl();

    @Override
    public List<Product> getAllProductsIds() throws SQLQueryException {
        var userId = UserDetails.getCurrentUserOrNull().getId();
        var baskets = basketRepository.getAll(userId);
        var productIds =  baskets.stream().map(Basket::getProductId).collect(Collectors.toList());
        var products =  productService.getByIds(productIds);
        LOGGER.log(INFO, "Finished getting all products from basket ids.");
        return products;
    }

    @Override
    public Basket addProductById(final UUID productId)
            throws SQLQueryException, ProductIsNotExistException {
        productService.isExistById(productId);
        var userId = UserDetails.getCurrentUserOrNull().getId();
        var basket = new Basket(null, userId, productId);
        var newBasket =  basketRepository.add(basket).orElseThrow(() -> new ProductIsNotExistException(productId));
        LOGGER.log(INFO, "Finished adding product to basket.");
        return newBasket;
    }

    @Override
    public void deleteProductById(final UUID productId)
            throws SQLQueryException, ProductIsNotExistException {
        var userId = UserDetails.getCurrentUserOrNull().getId();
        productService.isExistById(productId);
        basketRepository.delete(productId, userId);
        LOGGER.log(INFO, "Finished deleting product from basket.");
    }

}
