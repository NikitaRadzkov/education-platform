package com.javafundamentals.store.basket.view;

import com.javafundamentals.store.product.model.Product;

import java.util.List;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;

public class BasketOutputView {

    public void getAllProducts(final List<Product> products) {
        System.out.println();
        System.out.println("P R O D U C T S   I N   T H E   B A S K E T");
        System.out.println(DIVIDING_STRIP);
        if (products.size() == 0) {
            System.out.println(" No products in the basket");
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
