package com.myapp.java_springboot_server.controller;

import org.springframework.web.bind.annotation.RestController;
import com.myapp.java_springboot_server.lib.AuthUtil;

@RestController  // Change to RestController if this is part of an API
public class AuthController {

    private final AuthUtil authUtil;

    // Constructor injection for AuthUtil
    public AuthController(AuthUtil authUtil) {
        this.authUtil = authUtil;
    }

    // Login a user
    public String loginUser() {
        authUtil.validatePassword();  // Validate password
        authUtil.generateAccessToken();  // Generate access token
        return "User successfully logged in!";
    }
}
