package com.cl.packapp.backcustomer.model;

public class Customer {
	
	private String id;
	private String firstName;
    private String lastName;
    
    public Customer() {
    	super();
    }
    
    public Customer(final String id) {
    	super();
    	this.id = id;
    }
    
    public Customer(final String id, final String firstName, final String lastName) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(final String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(final String id) {
		this.id = id;
	}

}
