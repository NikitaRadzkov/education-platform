package com.javafundamentals.store.common.controller;

import com.javafundamentals.store.basket.controller.BasketController;
import com.javafundamentals.store.common.util.LoggerUtil;
import com.javafundamentals.store.common.util.UserDetails;
import com.javafundamentals.store.exception.UserIsNotSignInException;
import com.javafundamentals.store.product.controller.ProductController;
import com.javafundamentals.store.user.controller.UserController;

import static com.javafundamentals.store.common.util.Constants.DIVIDING_STRIP;
import static com.javafundamentals.store.common.util.Constants.SCANNER;
import static com.javafundamentals.store.user.model.enums.UserRole.ADMIN;

public class StartController {

    private final UserController userController= new UserController();
    private final ProductController productController = new ProductController();
    private final BasketController basketController = new BasketController();

    public void start() {
        try {
            var logger = new LoggerUtil();
            logger.initLogger();
            mainMenu();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void mainMenu() throws UserIsNotSignInException {
        var isSignIn = UserDetails.isUserSignIn();
        printMainMenu();
        var menuPoint = SCANNER.nextLine();
        switch (menuPoint) {
            case "1" :
                basketMenu();
                break;
            case "2" :
                if (isSignIn) {
                    productMenu();
                }
                break;
            case "3" :
                if (isSignIn) {
                    profileMenu();
                }
                break;
            case "4" :
                if (!isSignIn) {
                    signin();
                }
                break;
            case "5" :
                if (!isSignIn) {
                    signup();
                }
                break;
            case "6" :
                if (isSignIn) {
                    signout();
                }
                break;
            default:
                System.out.println("Invalid point. Try again");
        }
        mainMenu();
    }

    private void printMainMenu() {
        var isSignIn = UserDetails.isUserSignIn();
        System.out.println("S T O R E   M E N U");
        System.out.println(DIVIDING_STRIP);
        if (isSignIn) {
            System.out.println("1 - basket");
            System.out.println("2 - products");
            System.out.println("3 - profile");
        }
        if (!isSignIn) {
            System.out.println("4 - sign in");
            System.out.println("5 - sign up");
        }
        if (isSignIn) {
            System.out.println("6 - sign out");
        }
    }

    private void profileMenu() throws UserIsNotSignInException {
        var role = UserDetails.getCurrentUserRole();
        printProfileMenu();
        var menuPoint = SCANNER.nextLine();
        switch (menuPoint) {
            case "1" :
                showCurrentUserProfile();
                break;
            case "2" :
                updateCurrentUser();
                break;
            case "3" :
                deleteCurrentUser();
                break;
            case "4" :
                if (role != null && role.equals(ADMIN)) {
                    getAllUsers();
                }
                break;
            case "5" :
                if (role != null && role.equals(ADMIN)) {
                    updateUser();
                }
                break;
            case "6" :
                if (role != null && role.equals(ADMIN)) {
                    deleteUser();
                }
                break;
            default:
                System.out.println("Invalid point. Try again");
        }
        mainMenu();
    }

    private void printProfileMenu() throws UserIsNotSignInException {
        var role = UserDetails.getCurrentUserRole();
        System.out.println("P R O F I L E   M E N U");
        System.out.println(DIVIDING_STRIP);
        System.out.println("1 - Show current user profile");
        System.out.println("2 - Update current user");
        System.out.println("3 - Delete current user");
        if (role != null && role.equals(ADMIN)) {
            System.out.println("4 - Show all users");
            System.out.println("5 - Update user");
            System.out.println("6 - Delete user");
        }

    }

    private void productMenu() throws UserIsNotSignInException {
        var role = UserDetails.getCurrentUserRole();
        printProductMenu();
        var menuPoint = SCANNER.nextLine();
        switch (menuPoint) {
            case "1" :
                getAllProducts();
                break;
            case "2" :
                if (role != null && role.equals(ADMIN)) {
                    createProduct();
                }
                break;
            case "3" :
                if (role != null && role.equals(ADMIN)) {
                    updateProduct();
                }
                break;
            case "4" :
                if (role != null && role.equals(ADMIN)) {
                    deleteProduct();
                }
                break;
            default:
                System.out.println("Invalid point. Try again");
        }
        mainMenu();
    }

    private void printProductMenu() throws UserIsNotSignInException {
        var role = UserDetails.getCurrentUserRole();
        System.out.println("P R O D U C T   M E N U");
        System.out.println(DIVIDING_STRIP);
        System.out.println("1 - Show all products");
        if (role != null && role.equals(ADMIN)) {
            System.out.println("2 - Add product");
            System.out.println("3 - Update product");
            System.out.println("4 - Remove product");
        }
    }

    private void basketMenu() throws UserIsNotSignInException {
        printBasketMenu();
        var menuPoint = SCANNER.nextLine();
        switch (menuPoint) {
            case "1" :
                getAllProductsFromBasket();
                break;
            case "2" :
                addProductToBasket();
                break;
            case "3" :
                deleteProductFromBasket();
                break;
            default:
                System.out.println("Invalid point. Try again");
        }
        mainMenu();
    }

    private void printBasketMenu() {
        System.out.println("B A S K E T   M E N U");
        System.out.println(DIVIDING_STRIP);
        System.out.println("1 - Show basket");
        System.out.println("2 - Add product to basket");
        System.out.println("3 - Delete product from basket");
    }

    private void showCurrentUserProfile() {
        try {
            userController.getCurrentUser();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void updateCurrentUser() {
        try {
            userController.updateCurrentUser();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void deleteCurrentUser() {
        try {
            userController.deleteCurrentUser();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void getAllUsers() {
        try {
            userController.getAllUsers();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void updateUser() {
        try {
            userController.updateUser();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void deleteUser() {
        try {
            userController.deleteUser();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void signin() {
        try {
            userController.signin();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void signup() {
        try {
            userController.signup();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void signout() {
        userController.signout();
    }

    private void createProduct() {
        try {
            productController.createProduct();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void updateProduct() {
        try {
            productController.updateProduct();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void deleteProduct() {
        try {
            productController.deleteProduct();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void getAllProducts() {
        try {
            productController.getAllProducts();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void addProductToBasket() {
        try {
            basketController.addProduct();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void deleteProductFromBasket() {
        try {
            basketController.deleteProduct();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void getAllProductsFromBasket() {
        try {
            basketController.getAllProducts();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void printException(String message) {
        System.out.println(DIVIDING_STRIP);
        System.out.println();
        System.out.println(message);
        System.out.println();
        System.out.println(DIVIDING_STRIP);
    }

}
