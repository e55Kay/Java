package com.comcast.interfaces;

public class Car extends MotorisedVehicle implements IAdvanceVehicle{

	@Override
	public void drive() {
		System.out.println("The car is in drive mode");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("The car is turning left");
		
	}

	@Override
	public void brake() {
		System.out.println("The car is in brake mode");
		
	}
	
	@Override
	public void accelerate() {
		System.out.println("The car is accelerating");
	}
	
}
