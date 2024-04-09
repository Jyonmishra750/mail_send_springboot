package com.example.mailproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class MailprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MailprojectApplication.class, args);
	}
	
}
