package com.javafundamentals.store.exception;

import java.util.UUID;

public class ProductIsNotExistException extends Exception {

    public ProductIsNotExistException(UUID id) {

        super(String.format("Product with such id %s does not exist!", id));

    }

}
