package com.sort.comparator;

import java.util.Comparator;

public class ShapeComparator implements Comparator<Shape1>{

	@Override
	public int compare(Shape1 o1, Shape1 o2) {
		if(o1.getArea() < o2.getArea())
		return -1;
		else if(o1.getArea() > o2.getArea())
			return 1;
		return 0;
	}

}
