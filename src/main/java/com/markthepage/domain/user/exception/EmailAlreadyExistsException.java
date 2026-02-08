package com.markthepage.domain.user.exception;

public class EmailAlreadyExistsException extends RuntimeException {
    public EmailAlreadyExistsException(String email) {
        super("The email '" + email + "' is already registered in the system");
    }
}
