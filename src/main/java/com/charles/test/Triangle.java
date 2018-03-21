package com.charles.test;

public class Triangle extends Shape {
	
	private double height;
	private double base;
	
	public Triangle(double height , double base) {
		this.base = base;
		this.height = height;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Triangle :L "+this.getArea();
	}
}
