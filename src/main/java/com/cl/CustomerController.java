package com.cl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cl.model.Customer;

@RestController
public class CustomerController {

    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public Collection<Customer> findByLastName(@RequestParam("name") final String lastName) {
    	//TODO
    	List<Customer> customers = new ArrayList<Customer>();
    	return customers;
    }
    
    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET)
    public Customer findById(@PathVariable("id") final int id) {   	
    	//TODO
    	final Customer customer = new Customer("123", "Bob", "Kelso");
    	return customer;
    }
    
    @RequestMapping(value = "/customers", method = RequestMethod.PUT)
    public void save(@RequestParam("customer") final Customer customer) {   	
    	//TODO
    }
    
}
