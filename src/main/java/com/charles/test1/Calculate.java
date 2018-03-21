package com.charles.test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculate {
	public static void main(String[] args) {
		Square sq = new Square(10);
		Triangle tr = new Triangle(10,10);
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(sq);
		shapes.add(tr);
		
		Collections.sort(shapes);
		
		for(Shape shape: shapes) {
			System.out.println(shape);
		}
	}
}
