package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitMyProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitMyProjectApplication.class, args);
		
		System.out.println("=== GitMyProject ===");
		System.out.println("=== Git Push ===");
	}

}
