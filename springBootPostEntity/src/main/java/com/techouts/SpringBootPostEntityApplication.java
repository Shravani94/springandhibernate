package com.techouts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.techouts")
public class SpringBootPostEntityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPostEntityApplication.class, args);
	}

}
