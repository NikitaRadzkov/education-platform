package com.javafundamentals.store.exception;

public class DeleteAdminException extends Exception {

    public DeleteAdminException() {

        super("User with role admin can not be deleted!");

    }

}
