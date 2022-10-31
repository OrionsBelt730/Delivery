package com.qa.spring.deliveryproject;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.qa.spring.deliveryproject.model.Delivery;

@Configuration
@Profile("test")
public class TestAppConfig {

	@Bean
	public List<Delivery> delivery() {
		return new ArrayList<Delivery>();
	}

}
