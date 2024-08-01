package com.SpringIoC2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringIoC2.car.Car;
import com.SpringIoC2.impl.BMW;
import com.SpringIoC2.impl.Bugatti;
import com.SpringIoC2.impl.Mercedes;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		// Loading the XML file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
		
		//Getting the Beans.
		Car bmw = (BMW)context.getBean("bmw");
		Car bugatti = (Bugatti)context.getBean("bugatti");
		Car mercedes = (Mercedes)context.getBean("mercedes");
		
		// Printing the information.
		System.out.println(bmw.getCar());
		System.out.println(bugatti.getCar());
		System.out.println(mercedes.getCar());
		System.out.println(mercedes);
		
		context.close();

	}
}
