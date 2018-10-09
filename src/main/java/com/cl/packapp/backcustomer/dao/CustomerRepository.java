package com.cl.packapp.backcustomer.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cl.packapp.backcustomer.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {

	public List<Customer> findByLastName(final String lastName);
}
