package com.example.Validation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class UserController {
    @GetMapping("/user")
    public List<User> getAllUser() {
        return List.of(new User(2222, "Bihar", "Darbhanga", "India"));
    }
}
