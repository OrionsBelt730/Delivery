package com.qa.spring.deliveryproject.exceptions;

import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "Description Not Found")
public class DescriptionNotFoundException extends EntityNotFoundException {

	private static final long serialVersionUID = 1L;

}
