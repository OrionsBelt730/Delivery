package com.qa.spring.deliveryproject.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.spring.deliveryproject.DTO.DeliveryDTO;
import com.qa.spring.deliveryproject.exceptions.DescriptionNotFoundException;
import com.qa.spring.deliveryproject.model.Delivery;
import com.qa.spring.deliveryproject.repo.DeliveryRepo;

@Service
public class DeliveryService {

	@Autowired
	DeliveryRepo repo;

	public List<Delivery> getAll() {
		return repo.findAll();
	}

	public DeliveryDTO getOneByDescription(String description) throws DescriptionNotFoundException {
		Optional<Delivery> find = repo.getByDescription(description);
		if (find.isPresent()) {
			return new DeliveryDTO(find.get());
		}
		throw new DescriptionNotFoundException();
	}

	// create
	public Delivery create(Delivery delivery) {
		return repo.save(delivery);
	}

	// createMany

	// read
	public List<Delivery> getAllDelivery() {
		return this.repo.findAll();
	}

	// update
	public Delivery update(Long id, Delivery delivery) {
		Delivery found = repo.findById(id).orElse(new Delivery());

		found.setPurchaseDate(delivery.getPurchaseDate());
		found.setQuantity(delivery.getQuantity());
		found.setDescription(delivery.getDescription());
		found.setDelivered(delivery.getDelivered());

		return this.repo.save(found);
	}

	// delete
	public Boolean removeDelivery(Long index) {
		repo.deleteById(index);

		return (!repo.existsById(index));
	}

}
