package com.markthepage.domain.user.exception;

public class InvalidPasswordException extends RuntimeException {
    public InvalidPasswordException(String reason) {
        super("Invalid password: " + reason);
    }
}
