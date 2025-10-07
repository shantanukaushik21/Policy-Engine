package com.PolicyEngine.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner testMongo(MongoTemplate mongoTemplate) {
		return args -> {
			System.out.println("✅ Connected to Mongo DB: " + mongoTemplate.getDb().getName());
			System.out.println("Collections: " + mongoTemplate.getDb().listCollectionNames().into(new java.util.ArrayList<>()));
		};
	}

}
