package com.markthepage.domain.user.exception;

public class UsernameAlreadyExistsException extends RuntimeException {
    public UsernameAlreadyExistsException(String username) {
        super("The username '" + username + "' is already in use");
    }
}
