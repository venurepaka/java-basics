package com.sort.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {

	public static void main(String[] args) {
		
		Cirlce circle = new Cirlce(5);
		Triangle triangle = new Triangle(10, 10);
		Square square = new Square(20);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(circle);
		shapes.add(triangle);
		shapes.add(square);
		Collections.sort(shapes);
		
		for(Shape shape : shapes) {
			System.out.println(shape);
		}
		
	}
	
	
}
