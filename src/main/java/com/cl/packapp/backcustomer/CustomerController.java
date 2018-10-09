package com.cl.packapp.backcustomer;

import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cl.packapp.backcustomer.dao.CustomerRepository;
import com.cl.packapp.backcustomer.model.Customer;

@RestController
public class CustomerController {

	@Autowired
	private CustomerRepository repository;

	final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
    @RequestMapping(value = "/customers/", method = RequestMethod.GET)
    public Collection<Customer> find(@Param("name") final String lastName) {
    	if(lastName != null) {
    		return repository.findByLastName(lastName);
    	}
    	return repository.findAll();
    }
    
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Customer findById(@PathVariable("id") final String id) {
    	final Optional<Customer> customer = repository.findById(id);
    	return customer.get();
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    public ResponseEntity<?> create(@RequestBody final Customer customer) {
    	logger.debug("Save >>> " + customer);
    	repository.save(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.CREATED);
   }
    
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<?> save(@PathVariable("id") final String id, @RequestBody final Customer customer) {   	
    	customer.setId(id);
    	logger.debug("Save >>> " + customer);
    	repository.save(customer);
        return new ResponseEntity<Customer>(customer, HttpStatus.OK);    
    }
}
