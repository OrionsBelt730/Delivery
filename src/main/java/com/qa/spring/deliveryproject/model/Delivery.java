package com.qa.spring.deliveryproject.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class Delivery {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	@Column
	public LocalDate purchaseDate;

	@Min(1)
	@Column
	public int quantity;

	@Column
	public String description;

	@Column
	public Boolean confirmDelivered;

	public Object getQuantity() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setQuantity(Object quantity2) {
		// TODO Auto-generated method stub

	}

	public Object getPurchaseDate() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPurchaseDate(Object object) {
		// TODO Auto-generated method stub

	}

	public Object getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDescription(Object description2) {
		// TODO Auto-generated method stub

	}

	public Object getDelivered() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setDelivered(Object delivered) {
		// TODO Auto-generated method stub

	}

}
