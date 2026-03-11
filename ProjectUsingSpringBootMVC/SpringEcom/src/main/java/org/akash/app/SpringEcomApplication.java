package org.akash.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringEcomApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEcomApplication.class, args);
		System.out.println("Server started at port no 5678 successfully");
	}

}
