package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MongoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoJavaApplication.class, args);
		System.out.println("Working");
		System.out.println("Dynamic loading");
	}

}
