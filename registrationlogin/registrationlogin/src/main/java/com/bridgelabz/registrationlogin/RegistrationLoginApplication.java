package com.bridgelabz.registrationlogin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class RegistrationLoginApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to Registration Login project");
		SpringApplication.run(RegistrationLoginApplication.class, args);
	}

}
