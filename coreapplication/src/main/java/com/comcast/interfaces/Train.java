package com.comcast.interfaces;

public class Train implements IVehicle, IPublicTransport {
	int peopleNo;
	
	@Override
	public void getNumberOfPeople() {
		System.out.println("No. of people: " + peopleNo);
		
	}

	public void drive() {
		System.out.println("The train is in drive mode");
		
	}

	@Override
	public void turnLeft() {
		System.out.println("The train is turning left");
		
	}

	@Override
	public void brake() {
		System.out.println("The train is in brake mode");
		
	}

}
