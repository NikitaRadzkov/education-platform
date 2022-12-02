package com.javafundamentals.store.product.view;

import com.javafundamentals.store.exception.InvalidInputException;
import com.javafundamentals.store.product.model.Product;
import com.javafundamentals.store.product.validator.ProductValidator;

import java.util.UUID;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;
import static com.javafundamentals.store.common.util.Constants.SCANNER;

public class ProductInputView {

    private final ProductValidator productValidator = new ProductValidator();

    public Product create() {
        System.out.println();
        System.out.println("C R E A T E   A   N E W  P R O D U C T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter name -");
        var name = SCANNER.nextLine();
        System.out.println("- Enter price -");
        var price = SCANNER.nextLine();
        System.out.println("- Enter description -");
        var description = SCANNER.nextLine();
        var product = new Product(null, name, Float.parseFloat(price), description);
        try {
            productValidator.validate(product);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            create();
        }
        return product;
    }

    public Product update() {
        System.out.println();
        System.out.println("U P D A T E   P R O D U C T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter id -");
        var id = SCANNER.nextLine();
        System.out.println("- Enter name -");
        var name = SCANNER.nextLine();
        System.out.println("- Enter price -");
        var price = SCANNER.nextLine();
        System.out.println("- Enter description -");
        var description = SCANNER.nextLine();
        var product = new Product(null, name, Float.parseFloat(price), description);
        try {
            productValidator.validate(product);
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
            update();
        }
        return product;
    }

    public UUID delete() {
        System.out.println();
        System.out.println("D E L E T E   P R O D U C T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter id -");
        var id = SCANNER.nextLine();
        return UUID.fromString(id);
    }


}
