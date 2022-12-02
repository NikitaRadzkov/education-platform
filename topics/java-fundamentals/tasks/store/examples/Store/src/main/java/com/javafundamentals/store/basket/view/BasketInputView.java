package com.javafundamentals.store.basket.view;

import java.util.UUID;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;
import static com.javafundamentals.store.common.util.Constants.SCANNER;

public class BasketInputView {

    public UUID add() {
        System.out.println();
        System.out.println("A D D   P R O D U C T   T O   B A S K E T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter product id -");
        var id = SCANNER.nextLine();
        return UUID.fromString(id);
    }

    public UUID delete() {
        System.out.println();
        System.out.println("D E L E T E   P R O D U C T   F R O M   B A S K E T");
        System.out.println(DIVIDING_STRIP);
        System.out.println("- Enter product id -");
        var id = SCANNER.nextLine();
        return UUID.fromString(id);
    }

}
