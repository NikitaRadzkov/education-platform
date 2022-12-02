package common.controller;

import exception.InvalidPointException;
import process.controller.ProcessController;

import static common.util.Constant.DIVIDING_STRIP;
import static common.util.Constant.SCANNER;

public class StartController {

    private final ProcessController processController = new ProcessController();

    public void start() {
        try {
            menu();
        } catch (Exception e) {
            printException(e.getMessage());
        } finally {
            start();
        }
    }

    private void menu() throws InvalidPointException {
        var type = typesMenu();
        showProcessMenu();
        var point = SCANNER.nextLine();
        switch (point) {
            case "1":
                countPrime(type);
                break;
            case "2":
                exchangePosition(type);
                break;
            case "3":
                getMaxValue(type);
                break;
            default:
                throw new InvalidPointException();
        }
        menu();
    }

    private void showProcessMenu() {
        System.out.println();
        System.out.println("D A T A   P R O C E S S I N G   M E N U");
        System.out.println(DIVIDING_STRIP);
        System.out.println("1 - Count the number which is prime number");
        System.out.println("2 - Exchange the positions of two different elements");
        System.out.println("3 - Get the max element");
    }

    private String typesMenu() throws InvalidPointException {
        showTypesMenu();
        var point = SCANNER.nextLine();
        String type;
        switch (point) {
            case "1":
                type =  "Integer";
                break;
            case "2":
                type =  "Long";
                break;
            case "3":
                type =  "Short";
                break;
            case "4":
                type =  "Byte";
                break;
            case "5":
                type =  "Double";
                break;
            case "6":
                type =  "Float";
                break;
            default:
                throw new InvalidPointException();
        }
        return type;
    }

    private void showTypesMenu() {
        System.out.println();
        System.out.println("T Y P E S   M E N U");
        System.out.println(DIVIDING_STRIP);
        System.out.println("1 - Integer");
        System.out.println("2 - Long");
        System.out.println("3 - Short");
        System.out.println("4 - Byte");
        System.out.println("5 - Double");
        System.out.println("6 - Float");
    }

    private void getMaxValue(final String type) {
        processController.getMaxValue(type);
    }

    private void countPrime(final String type) {
        processController.countPrime(type);
    }

    private void exchangePosition(final String type) {
        processController.exchangePosition(type);
    }

    private void printException(final String exception) {
        System.out.println();
        System.out.println(DIVIDING_STRIP);
        System.out.println(exception);
        System.out.println(DIVIDING_STRIP);
    }

}
