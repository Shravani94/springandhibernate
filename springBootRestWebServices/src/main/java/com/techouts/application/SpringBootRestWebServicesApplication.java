package com.techouts.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com.techouts.application" )
public class SpringBootRestWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRestWebServicesApplication.class, args);
	}

}
