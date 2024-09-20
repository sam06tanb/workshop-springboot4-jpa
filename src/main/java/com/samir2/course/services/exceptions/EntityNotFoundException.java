package com.samir2.course.services.exceptions;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public EntityNotFoundException(Object id) {
		super("Resource not found. Id " + id);
	}
}