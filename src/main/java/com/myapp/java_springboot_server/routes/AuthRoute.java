package com.myapp.java_springboot_server.routes;

import org.springframework.web.bind.annotation.*;
import com.myapp.java_springboot_server.controller.AuthController;
import com.myapp.java_springboot_server.controller.UsersController;

@RestController
@RequestMapping("/api/auth")  // Base path for all user-related routes
public class AuthRoute{
    
    // Use dependency injection to get the AuthController
    private final AuthController authController;

    // Constructor injection for UsersController
    public AuthRoute(AuthController authController) {
        this.authController = authController;
    }
}