package com.comcast.interfaces;

public class Vehicles {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.drive();
		car.brake();
		car.turnLeft();
		car.checkMotor();
		car.accelerate();
		
		System.out.println("");
		
		Train train = new Train();
		train.peopleNo = 20;
		train.getNumberOfPeople();
		train.drive();
		train.brake();
		train.turnLeft();
		
	}

}
