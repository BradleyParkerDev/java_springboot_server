package com.bradley.java_springboot_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Server {

	public static void main(String[] args) {
		System.out.println("Starting server!!!");
		SpringApplication.run(Server.class, args);
	}

}
