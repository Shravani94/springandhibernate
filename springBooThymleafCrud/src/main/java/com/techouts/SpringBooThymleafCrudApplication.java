package com.techouts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.techouts")
public class SpringBooThymleafCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBooThymleafCrudApplication.class, args);
	}

}
