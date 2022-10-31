package com.qa.spring.deliveryproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.spring.deliveryproject.model.Delivery;
import com.qa.spring.deliveryproject.service.DeliveryService;

@RestController
@RequestMapping("/Delivery")
public class DeliveryController {

	@Autowired
	DeliveryService service;

	@RequestMapping("/test")
	public String HelloWorld() {
		return "Hello World!";
	}

	@GetMapping("/getAll")
	public List<Delivery> getAll() {
		return service.getAll();
	}

	@PostMapping("/create")
	public Delivery create(@RequestBody Delivery delivery) {
		return service.create(delivery);
	}

	@PostMapping("/createMany")
	public List<Delivery> createMany(@RequestBody List<Delivery> deliveries) {
		return service.createMany(deliveries);
	}

	@PutMapping("/update{id}")
	public Delivery update(@PathVariable("id") Long id, @RequestBody Delivery delivery) {
		return service.update(id, delivery);
	}

	@DeleteMapping("/delete/{index}")
	public boolean deleteOne(@PathVariable("index") Long index) {
		return service.delete(index);
	}
}
