package com.SpringIoC2.impl;

import com.SpringIoC2.car.Car;

public class Mercedes implements Car {
	
	String name;
	
	public Mercedes() {
		// TODO Auto-generated constructor stub
	}

	public Mercedes(String name) {
		super();
		this.name = name;
	}


	@Override
	public String getCar() {
		// TODO Auto-generated method stub
		return name;
	}
	
	void customInit() {
		System.out.println("Init method called");
	}

	void customDestroy(){
		System.out.println("Destroy method called");
	}
}
