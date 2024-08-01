package com.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class Main {

	public static void main(String[] args) {
	
		
		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class);
				
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction type = session.beginTransaction();
		
		// Inserting the data -------------------------
		
//		Employee e = new Employee(2, "Sam", "sam@gmail.com", "IT", 70000);
//		session.save(e);
		
		// Getting one row ----------------------------
		
//		Employee e = session.get(Employee.class, 2);
//		System.out.println(e);
	
		// Updating the data --------------------------
		
//		Employee e = session.get(Employee.class, 2);
//		e.setSalary(90000);
//		session.update(e);
		
		// Deleting the row ---------------------------
		
//		Employee e = session.get(Employee.class, 2);
//		session.delete(e);
		
		// Fetching all the rows ----------------------
		
//		Query query = session.createQuery("FROM Employee e"); // Hibernate Query Language  
//		List resultList = query.getResultList();
//		for (Object object : resultList) {
//			System.out.println(object);
//		}
		
		// Increasing the salary ----------------------
		
//		Query query = session.createQuery("UPDATE Employee e SET e.salary = e.salary + 20000 WHERE e.salary < 100000");
//		int executeUpdate = query.executeUpdate();
//		System.out.println("rows affected: " + executeUpdate);
		
		// Deleting multiple rows ---------------------
		
//		Query query = session.createQuery("DELETE FROM Employee e WHERE e.department = 'IT'");
//		int executeUpdate = query.executeUpdate();
//		System.out.println("rows affected: " + executeUpdate);
		
		
		type.commit();

	}
}
