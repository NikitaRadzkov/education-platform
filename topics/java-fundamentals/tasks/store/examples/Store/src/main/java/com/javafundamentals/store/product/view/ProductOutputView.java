package com.javafundamentals.store.product.view;

import com.javafundamentals.store.product.model.Product;

import java.util.List;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;

public class ProductOutputView {

    public void create() {
        System.out.println();
        System.out.println("Product created successfully");
        System.out.println(DIVIDING_STRIP);
        System.out.println();
    }

    public void update() {
        System.out.println();
        System.out.println("Product updated successfully");
        System.out.println(DIVIDING_STRIP);
        System.out.println();
    }

    public void delete() {
        System.out.println();
        System.out.println("Product deleted successfully");
        System.out.println(DIVIDING_STRIP);
        System.out.println();
    }

    public void getAllProducts(final List<Product> products) {
        System.out.println();
        System.out.println("P R O D U C T S");
        System.out.println(DIVIDING_STRIP);
        if (products.size() == 0) {
            System.out.println(" No products");
            System.out.println();
        }
        products.forEach(product -> {
            System.out.println("id | " + product.getId());
            System.out.println("name | " + product.getName());
            System.out.println("price| " + product.getPrice());
            System.out.println("description | " + product.getDescription());
            System.out.println();
        });
    }

}
