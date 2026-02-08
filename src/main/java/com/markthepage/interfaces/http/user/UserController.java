package com.markthepage.interfaces.http.user;

import org.springframework.web.bind.annotation.RestController;
import com.markthepage.application.user.CreateUserService;
import com.markthepage.domain.user.User;
import com.markthepage.interfaces.http.user.dtos.CreateUserRequest;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {
    private final CreateUserService createUserService;

    public UserController(CreateUserService createUserService) {
        this.createUserService = createUserService;
    }

    @PostMapping("/users")
    public User CreateUser(@RequestBody CreateUserRequest request) {
        return createUserService.createUser(
                request.getUsername(),
                request.getEmail(),
                request.getPassword());
    }

}
