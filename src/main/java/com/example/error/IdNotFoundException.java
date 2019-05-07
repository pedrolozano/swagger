package com.example.error;

public class IdNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public IdNotFoundException(String customerId) {
		super ("CustomerId Not Found "+ customerId);
	}
}
