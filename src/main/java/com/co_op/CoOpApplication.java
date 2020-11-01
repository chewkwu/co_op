package com.co_op;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class CoOpApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoOpApplication.class, args);
	}

}
