package com.myapp.java_springboot_server.controller;

import org.springframework.web.bind.annotation.RestController;
import com.myapp.java_springboot_server.lib.AuthUtil;

@RestController  // Change to RestController if this is part of an API
public class UsersController {

    private final AuthUtil authUtil;

    // Constructor injection for AuthUtil
    public UsersController(AuthUtil authUtil) {
        this.authUtil = authUtil;
    }

    // Register a new user
    public String registerUser() {
        return "Created new user!";
    }

    // Get user data
    public String getUserData() {
        return "User data!";
    }

    // Update user data
    public String updateUserData() {
        return "Updated user!";
    }

    // Delete user data
    public String deleteUserData() {
        return "Deleted user!";
    }
}


