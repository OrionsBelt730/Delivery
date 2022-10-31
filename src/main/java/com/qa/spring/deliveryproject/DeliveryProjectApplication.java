package com.qa.spring.deliveryproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.qa.spring.deliveryproject")
@EntityScan("com.qa.spring.deliveryproject.model")
@EnableJpaRepositories("com.qa.spring.deliveryproject.repo")

public class DeliveryProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DeliveryProjectApplication.class, args);
	}

}
