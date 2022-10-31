package com.qa.spring.deliveryproject;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.Sql.ExecutionPhase;

import com.qa.spring.deliveryproject.repo.DeliveryRepo;

@SpringBootTest(classes = DeliveryProjectApplication.class)
@ActiveProfiles("dev")
@Sql(scripts = { "classpath:delivery-data.sql" }, executionPhase = ExecutionPhase.BEFORE_TEST_METHOD)

class DeliveryProjectApplicationTests {

	@Autowired
	DeliveryRepo repo;

	@Test
	void repoDemo() {
		System.out.println(repo.findAll());
	}

}
