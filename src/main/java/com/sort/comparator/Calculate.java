package com.sort.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Calculate {
	public static void main(String[] args) {
		Square sq = new Square(10);
		Triangle tr = new Triangle(10,10);
		
		List<Shape1> shapes = new ArrayList<>();
		shapes.add(sq);
		shapes.add(tr);
		
		Collections.sort(shapes, new ShapeComparator());
		
		for(Shape1 shape: shapes) {
			System.out.println(shape);
		}
	}
}
