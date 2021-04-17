package com.jarus.model;

public class Insurence {

	Long id;

	String name;

	String address;

	public Insurence(Long id, String name, String address) {

		super();
		this.id = id;

		this.name = name;
		this.address = address;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getAddress() { 
		return address;
	}

	public void setAddress(String address) { 
		this.address = address; 
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() { return id;}

}
