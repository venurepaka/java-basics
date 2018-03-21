package com.sort.comparator;

public class Square implements Shape1{

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
