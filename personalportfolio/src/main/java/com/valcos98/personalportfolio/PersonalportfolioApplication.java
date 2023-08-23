package com.valcos98.personalportfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;

@SpringBootApplication
@EnableEncryptableProperties
public class PersonalportfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonalportfolioApplication.class, args);
	}

}
