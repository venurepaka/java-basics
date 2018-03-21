package com.charles.test1;

public class Square extends Shape{

	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	@Override
	public double getArea() {
		return side*side;
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "are="+this.getArea();
	}
	
}
