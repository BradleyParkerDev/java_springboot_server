package com.myapp.java_springboot_server.lib;
import org.springframework.stereotype.Component;


@Component  // Mark AuthUtil as a Spring component for dependency injection
public class AuthUtil {

    public String generateAccessToken() {
        return "Access token generated!";
    }

    public String verifyAccessToken() {
        return "Access token verified!";
    }

    public String hashPassword() {
        return "Password hashed!";
    }

    public String validatePassword() {
        return "Passwords matched!";
    }

    // Middleware
    public String authorizeUser() {
        return "Middleware!";
    }
}
