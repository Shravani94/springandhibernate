package com.techouts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages="com.techouts")

public class SpringBootH2DataBaseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootH2DataBaseApplication.class, args);
	}

}
