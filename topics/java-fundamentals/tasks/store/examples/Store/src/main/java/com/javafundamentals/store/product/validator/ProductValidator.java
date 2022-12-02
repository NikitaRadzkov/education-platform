package com.javafundamentals.store.product.validator;

import com.javafundamentals.store.exception.InvalidInputException;
import com.javafundamentals.store.product.model.Product;

public class ProductValidator {

    private final static String NAME_PATTERN = "[\\w\\s]+";
    private final static String PRICE_PATTERN = "^([+-]?\\d*\\.?\\d*)$";
    private final static String INVALID_INPUT_EXCEPTION_MESSAGE = "Invalid %s field!\n";

    public boolean validate(final Product product) throws InvalidInputException {
        String exceptionMessage = "";
        if (!product.getName().matches(NAME_PATTERN)) {
            exceptionMessage = exceptionMessage.concat(String.format(INVALID_INPUT_EXCEPTION_MESSAGE, "name"));
        }
        if (!exceptionMessage.equals("")) {
            throw new InvalidInputException(exceptionMessage);
        }
        return true;
    }

}
