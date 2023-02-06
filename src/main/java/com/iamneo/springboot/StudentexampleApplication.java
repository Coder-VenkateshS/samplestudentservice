package com.iamneo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

@SpringBootApplication
@ComponentScan(basePackages = {"com.iamneo.springboot"})
public class StudentexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentexampleApplication.class, args);
	}

}
