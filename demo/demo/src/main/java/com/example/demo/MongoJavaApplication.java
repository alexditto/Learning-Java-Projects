package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.mongodb.MongoClientException;

@SpringBootApplication
public class MongoJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoJavaApplication.class, args);
		// MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
		System.out.println("Working");
		System.out.println("Dynamic loading");
	}

}
