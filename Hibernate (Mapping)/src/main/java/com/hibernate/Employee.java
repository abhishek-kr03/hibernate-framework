package com.hibernate;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "e_id")
	private int id;
	
	@Column(name = "e_name")
	private String name;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name = "emp_project_details",
			joinColumns = @JoinColumn(name = "e_id"),
			inverseJoinColumns = @JoinColumn(name = "p_id")
			)
	private List<Projects> projects;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(int id , String name) {
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
	
	public void setProjects(List<Projects> projects) {
		this.projects = projects;
	}
	public List<Projects> getProjects() {
		return projects;
	}
	
	@Override
	public String toString() {
		return id +" "+ name;
	}
}
