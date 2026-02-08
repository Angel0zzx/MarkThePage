package com.markthepage.application.user;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
import com.markthepage.domain.user.User;
import com.markthepage.domain.user.exception.EmailAlreadyExistsException;
import com.markthepage.domain.user.exception.InvalidPasswordException;
import com.markthepage.domain.user.exception.UsernameAlreadyExistsException;

@Service
public class CreateUserService {

    private List<User> users = new ArrayList<>();
    

    public User createUser(String username, String email, String password) {
        validateEmailNotExists(email);
        validateUsernameNotExists(username);
        validatePassword(password);
        
        User newUser = new User(username, email, password);
        users.add(newUser);
        
        return newUser;
    }

    private void validateEmailNotExists(String email){
        for (User user : users){
            if (user.getEmail().equals(email)) {
                throw new EmailAlreadyExistsException(email);
            }
        }
    }

    private void validateUsernameNotExists(String username) {
        for (User user : users) {
            if(user.getUsername().equals(username)) {
                throw new UsernameAlreadyExistsException(username);
            }
        }
    }

    private void validatePassword (String password) {
        if (password == null || password.isEmpty()) {
            throw new InvalidPasswordException("it cannot be empty");
        }
        if (password.length() < 5) {
            throw new InvalidPasswordException("It must have at least 5 characters");
        }
    }

}
