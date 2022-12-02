package com.javafundamentals.store.product.service.impl;

import com.javafundamentals.store.exception.ProductIsNotExistException;
import com.javafundamentals.store.exception.SQLQueryException;
import com.javafundamentals.store.product.model.Product;
import com.javafundamentals.store.product.repository.ProductRepository;
import com.javafundamentals.store.product.repository.impl.ProductRepositoryImpl;
import com.javafundamentals.store.product.service.ProductService;

import java.util.List;
import java.util.UUID;

import static com.javafundamentals.store.common.util.LoggerUtil.LOGGER;
import static java.util.logging.Level.INFO;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository = new ProductRepositoryImpl();

    @Override
    public void create(final Product product) throws SQLQueryException {
        productRepository.save(product);
        LOGGER.log(INFO, "Finished creating product.");
    }

    @Override
    public List<Product> getAll() throws SQLQueryException {
        var products =  productRepository.getAll();
        LOGGER.log(INFO, "Finished getting all products.");
        return products;
    }

    @Override
    public void update(final Product productToUpdate)
            throws ProductIsNotExistException, SQLQueryException {
        productRepository.getById(productToUpdate.getId()).orElseThrow(() ->
                new ProductIsNotExistException(productToUpdate.getId()));
        productRepository.update(productToUpdate);
        LOGGER.log(INFO, "Finished updating product.");
    }

    @Override
    public void delete(final UUID id) throws ProductIsNotExistException, SQLQueryException {
        productRepository.getById(id).orElseThrow(() -> new ProductIsNotExistException(id));
        productRepository.delete(id);
        LOGGER.log(INFO, "Finished deleting product.");
    }

    @Override
    public boolean isExistById(final UUID id) throws ProductIsNotExistException, SQLQueryException {
        productRepository.getById(id).orElseThrow(() -> new ProductIsNotExistException(id));
        LOGGER.log(INFO, "Finished checking product existing.");
        return true;
    }

    @Override
    public List<Product> getByIds(final List<UUID> ids) throws SQLQueryException {
        var products =  productRepository.getAllById(ids);
        LOGGER.log(INFO, "Finish getting all products by ids.");
        return products;
    }

}
