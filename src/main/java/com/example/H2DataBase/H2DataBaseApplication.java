package com.example.H2DataBase;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@Enablewebmvc
public class H2DataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2DataBaseApplication.class, args);
	}



}
