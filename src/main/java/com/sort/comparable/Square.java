package com.sort.comparable;

public class Square extends Shape {
	
	private double length;
	
	public Square(double length) {
		this.length = length;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length * this.length;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "SQUARE :L "+this.getArea();
	}
}
