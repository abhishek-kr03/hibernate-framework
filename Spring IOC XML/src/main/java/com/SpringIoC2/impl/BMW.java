package com.SpringIoC2.impl;

import com.SpringIoC2.car.Car;

public class BMW implements Car {

	String name ; 

	public BMW() {
		// TODO Auto-generated constructor stub
	}
	
	public BMW(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getCar() {
		// TODO Auto-generated method stub
		return name;
	}

}
