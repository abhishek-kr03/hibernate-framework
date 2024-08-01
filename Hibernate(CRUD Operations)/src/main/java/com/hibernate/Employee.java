package com.hibernate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table (name = "employee")
public class Employee {
	
	@Id
	@Column (name = "id")
	int id;
	
	@Column(name = "name")
	String name;
	
	@Column(name = "email")
	String email;
	
	@Column(name = "department")
	String department;
	
	@Column(name = "salary")
	int salary;
	
	public Employee() {
		
	}

	public Employee(int id, String name, String email, String department, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return id +" "+ name +" "+ email +" "+ department +" "+ salary;
	}
	
}
