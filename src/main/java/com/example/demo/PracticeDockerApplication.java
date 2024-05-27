package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;

import lombok.Data;

@SpringBootApplication
public class PracticeDockerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeDockerApplication.class, args);
	}

}

