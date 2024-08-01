package com.hibernate;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cid" ) 
	private CustomerDetails customerDetails;
	
	@OneToMany(mappedBy = "customer" , cascade = CascadeType.ALL)
	private List<Orders> orders;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setCustomerDetails(CustomerDetails customerDetails) {
		this.customerDetails = customerDetails;
	}
	
	public CustomerDetails getCustomerDetails() {
		return customerDetails;
	}
	
	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
	
	public List<Orders> getOrders() {
		return orders;
	}
	
	@Override
	public String toString() {
		return id +" "+ name;
	}
}
