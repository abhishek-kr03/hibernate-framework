package com.hibernate;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {	
		
//		Configuration cfg = new Configuration();
//		cfg.configure().addAnnotatedClass(Customer.class).addAnnotatedClass(CustomerDetails.class).addAnnotatedClass(Orders.class);
//		SessionFactory factory = cfg.buildSessionFactory();
//		Session session = factory.openSession();
//		Transaction transaction = session.beginTransaction();
		
/******************* ONE to ONE Mapping *********************/
		
		// Inserting the Customer & Customer details.
		
//		Customer c = new Customer(2, "Tim");
//		CustomerDetails cd = new CustomerDetails(102, "tim@gmail.gmail", 986789648, "USA");
//		c.setCustomerDetails(cd);
//		session.save(c);
	
		// Using Customer fetching the Customer & CustomrDetails.
		
//		Customer customer = session.get(Customer.class, 3);
//		CustomerDetails customerDetails = customer.getCustomerDetails();
//		System.out.println(customer);
//		System.out.println(customerDetails);
		
		// Using CustomerDetails fetching the CustomerDetails & Customer.
		
//		CustomerDetails customerDetails = session.get(CustomerDetails.class, 101);
//		Customer customer = customerDetails.getCustomer();
//		System.out.println(customerDetails);
//		System.out.println(customer);
		
		
/******************* MANY to ONE Mapping *********************/		
		
		// Mapping/Inserting multiple orders to one customer.
		
//		Orders noodles = new Orders(501, "Noodles", 69);
//		Orders biriyani = new Orders(502, "Biriyani", 300);
//		Orders pizza = new Orders(503, "Pizza", 169);
//		
//		Customer tim = session.get(Customer.class, 1);
//		
//		noodles.setCustomer(tim);
//		biriyani.setCustomer(tim);
//		pizza.setCustomer(tim);
//		
//		session.save(noodles);
//		session.save(biriyani);
//		session.save(pizza);
		
		// Inserting new ORDER with new CUSTOMER as well as CUSTOMER DETAILS.
		
//		Customer sundar = new Customer(4, "Sundar");
//		CustomerDetails detail = new CustomerDetails(104, "sundar@gmail.com", 755476756, "India");
//		
//		sundar.setCustomerDetails(detail);
//		session.save(detail);
//		
//		Orders dosa = new Orders(504, "Dosa", 69);
//		Orders idly = new Orders(505, "Idly", 39);
//		Orders vada = new Orders(506, "Vada", 35);
//		
//		dosa.setCustomer(sundar);
//		idly.setCustomer(sundar);
//		vada.setCustomer(sundar);
//		
//		session.save(dosa);
//		session.save(idly);
//		session.save(vada);
		
		// Using Orders fetching the Orders and Customer and using Customer fetching Customer details.
		
//		Orders order = session.get(Orders.class, 501);
//		Customer customer = order.getCustomer();
//		CustomerDetails customerDetails = customer.getCustomerDetails();
//		System.out.println(order);
//		System.out.println(customer);
//		System.out.println(customerDetails);
		
/******************* ONE to MANY Mapping *********************/	
		
		// Using the Customer Fetching all the Orders he Ordered.
		
//		Customer customer = session.get(Customer.class, 1);
//		List<Orders> orders = customer.getOrders();
//		System.out.println(customer);
//		for (Orders list : orders) {
//			System.out.println(list);
//		}
		
		// Deleting an order from the Orders.
		
//		Orders idly = session.get(Orders.class, 505);
//		session.delete(idly);
		
/******************* MANY to MANY Mapping *********************/	

		// Inserting Data using Employee object and Projects object 

		Configuration cfg = new Configuration();
		cfg.configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Projects.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
//		Employee tim = new Employee(1, "Tim");
//		Employee sam = new Employee(2, "Sam");
//		
//		Projects gDrive = new Projects(101, "Google_Drive");
//		Projects gSlides = new Projects(102, "Google_Slides");
//		
//		List<Projects> projects = new ArrayList<Projects>();
//		projects.add(gDrive);
//		projects.add(gSlides);
//		
//		tim.setProjects(projects);
//		sam.setProjects(projects);
//		
//		session.persist(tim); // save(depreciated) or persist.
//		session.persist(sam);   
//		session.persist(gDrive);
//		session.persist(gSlides);
		
		// Fetching the Projects Using Employee object.
		
//		Employee tim = session.get(Employee.class, 1);
//		System.out.println(tim);
//		System.out.println();
//		List<Projects> projects = tim.getProjects();
//		for (Projects p : projects)
//		{
//			System.out.println(p);
//		}
		
		// Fetching the Employees using the Projects Object.
		
//		Projects gd = session.get(Projects.class, 101);
//		System.out.println(gd);
//		List<Employee> e = gd.getEmployee();
//		Iterator itr = e.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		transaction.commit();

	}
}
