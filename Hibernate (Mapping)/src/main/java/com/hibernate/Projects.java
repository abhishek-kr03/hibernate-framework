package com.hibernate;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "projects")
public class Projects {
	
	@Id
	@Column(name = "p_id")
	private int projectId;
	
	@Column(name = "p_name")
	private String projectName;
	
	@ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinTable(name = "emp_project_details",
			joinColumns = @JoinColumn(name = "p_id"),
			inverseJoinColumns = @JoinColumn(name = "e_id")
			)
	private List<Employee> employee;
	
	public Projects() {
		// TODO Auto-generated constructor stub
	}

	public Projects(int projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	
	@Override
	public String toString() {
		return projectId +" "+ projectName;
	}
}
