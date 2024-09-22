package com.myapp.java_springboot_server.routes;

import org.springframework.web.bind.annotation.*;
import com.myapp.java_springboot_server.controller.UsersController;

@RestController
@RequestMapping("/api/users")  // Base path for all user-related routes
public class UsersRoute {

    // Use dependency injection to get the UsersController
    private final UsersController usersController;

    // Constructor injection for UsersController
    public UsersRoute(UsersController usersController) {
        this.usersController = usersController;
    }

    // Example of a GET request to return user data
    @PostMapping("/register-user")
    public String registerUser() {
        // Call method from UsersController to get user data
        return usersController.registerUser();
    }
    // Example of a GET request to return user data
    @GetMapping("/get-user-data")
    public String getUserData() {
        // Call method from UsersController to get user data
        return usersController.getUserData();
    }
    // Example of a GET request to return user data
    @PutMapping("/update-user-data")
    public String updateUserData() {
        // Call method from UsersController to get user data
        return usersController.updateUserData();
    }
    // Example of a GET request to return user data
    @DeleteMapping("/delete-user-data")
    public String deleteUserData() {
        // Call method from UsersController to get user data
        return usersController.deleteUserData();
    }
}
