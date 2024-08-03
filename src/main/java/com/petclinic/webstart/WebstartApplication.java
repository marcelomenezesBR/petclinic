package com.petclinic.webstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = "com.petclinic")
public class WebstartApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebstartApplication.class, args);
	}

}


