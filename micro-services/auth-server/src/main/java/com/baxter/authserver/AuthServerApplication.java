package com.baxter.authserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthServerApplication {

	public static void main(String[] args) {
		System.out.println("hello");
		SpringApplication.run(AuthServerApplication.class, args);
	}

}
