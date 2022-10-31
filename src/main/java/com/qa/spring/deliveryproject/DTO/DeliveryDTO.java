package com.qa.spring.deliveryproject.DTO;

import java.time.LocalDate;

import com.qa.spring.deliveryproject.model.Delivery;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode

public class DeliveryDTO {

	public DeliveryDTO(Delivery delivery) {
		// TODO Auto-generated constructor stub
	}

	public Long id;
	private LocalDate purchaseDate;
	private int quantity;
	private String description;
	private Boolean delivered;

}
