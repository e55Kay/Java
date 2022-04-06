package com.comcast.interfaces;

class IShapeMain implements IShape {
	Double radius = 5.;

	@Override
	public Double calculateArea() {
		Double area = 3.14 * radius * radius;
		return area;
	}

	@Override
	public Double calculateVolume() {
		Double volume = (4/3)*3.14*radius*radius*radius;
		return volume;
	}
}

public class Circle {
	public static void main(String[] args) {
		IShapeMain ishape = new IShapeMain();
		Double Area = ishape.calculateArea();
		Double Volume = ishape.calculateVolume();
		System.out.println("Area of Circle " + Area);
		System.out.println("Volume of Circle " + Volume);
	}
}
