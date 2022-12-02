package com.javafundamentals.phonebook.common.service;

import com.javafundamentals.phonebook.contact.controller.ContactController;

import static com.javafundamentals.phonebook.common.util.Constants.DIVIDING_STRIP;
import static com.javafundamentals.phonebook.common.util.Constants.SCANNER;

public class StartService {

    private final ContactController contactController = new ContactController();

    public void start() {
        menu();
    }

    private void menu(){
        showMenu();
        var menuPoint = SCANNER.nextLine();
        switch (menuPoint) {
            case "1" :
                addContact();
                break;
            case "2" :
                updateContact();
                break;
            case "3" :
                deleteContact();
                break;
            case "4" :
                showContacts();
                break;
            case "5" :
                System.exit(200);
                break;
            default:
                System.out.println("Invalid point. Try again");
        }
        menu();
    }

    private void showMenu() {
        System.out.println("P H O N E   C O N T A C T S");
        System.out.println(DIVIDING_STRIP);
        System.out.println("1 - Add contact");
        System.out.println("2 - Update contact");
        System.out.println("3 - Delete contact");
        System.out.println("4 - Select all");
        System.out.println("5 - Exit");
    }

    private void addContact() {
        try {
            contactController.add();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void updateContact() {
        try {
            contactController.update();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void deleteContact() {
        try {
            contactController.delete();
        } catch (Exception e) {
            printException(e.getMessage());
        }
    }

    private void showContacts() {
        try {
            contactController.getAll();
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
