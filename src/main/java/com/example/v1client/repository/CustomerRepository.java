package com.example.v1client.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.example.error.IdNotFoundException;
import com.example.v1client.api.NotFoundException;
import com.example.v1client.model.CustomerDetail;

public class CustomerRepository {

	private List<CustomerDetail> customers = new ArrayList<>();

	public CustomerDetail findById(String customerId) throws NotFoundException {
		Optional<CustomerDetail> customer = customers.stream().filter(p -> p.getId().equals(customerId)).findFirst();
		if (customer.isPresent())
			return customer.get();
		else
			return customer.orElseThrow(() -> new NotFoundException(1,"not found that id"));
	}
	
	/*public void delete(Long id) {
		customers.remove(id.intValue());
	}*/
	
	/*public List<Customer> find(List<Long> ids) {
		return customers.stream().filter(p -> ids.contains(p.getId())).collect(Collectors.toList());
	}*/
	
}