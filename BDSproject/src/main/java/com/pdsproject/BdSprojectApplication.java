package com.pdsproject;

import com.pdsproject.controller.ProductController;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackageClasses = ProductController.class)
@SpringBootApplication
public class BdSprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BdSprojectApplication.class, args);
	}

}
