package com.bradley.java_springboot_server.controller;

public class GreetingRequest {

    private String name;
    private String message;

    // Constructors
    public GreetingRequest() {}

    public GreetingRequest(String name, String message) {
        this.name = name;
        this.message = message;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
