package com.charles.test;

public class Cirlce extends Shape {

	private double radius;

	public Cirlce(double radius) {
		this.radius = radius;
	}

	@Override
	public double getArea() {
		return Math.PI * radius * radius;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cirlce :L "+this.getArea();
	}

}
