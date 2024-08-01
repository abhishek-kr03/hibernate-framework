package com.hibernate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer_details")
public class CustomerDetails {

	@Id
	@Column(name = "cid")
	private int cid;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "phone_number")
	private long phoneNumber;
	
	@Column(name = "address")
	private String address;
	
	@OneToOne(mappedBy = "customerDetails" , cascade = CascadeType.ALL)
	private Customer customer;
	
	public CustomerDetails() {
		// TODO Auto-generated constructor stub
	}

	public CustomerDetails(int cid, String email, long phoneNumber, String address) {
		super();
		this.cid = cid;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	
	@Override
	public String toString() {
		return cid +" "+ email +" "+ phoneNumber +" "+ address;
	}
	
}
