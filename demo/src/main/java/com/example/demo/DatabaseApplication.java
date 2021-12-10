package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DatabaseApplication {

	public static void main(String[] args) {
		System.out.println("System Working");
		SpringApplication.run(DatabaseApplication.class, args);
	}

}
