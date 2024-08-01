package com.SpringIoC2.impl;

import com.SpringIoC2.car.Car;

public class Bugatti implements Car {
	
	String name;
	
	public Bugatti() {
		// TODO Auto-generated constructor stub
	}
	
	public Bugatti(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getCar() {
		// TODO Auto-generated method stub
		return name;
	}

}
