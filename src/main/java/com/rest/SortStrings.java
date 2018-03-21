package com.rest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortStrings {

	public static void main(String[] args) {
		String s1 = "x";
		String s2 = "d";
		String s3 = "f";
		
		List<String> strings = new ArrayList<String>();
		strings.add(s1);
		strings.add(s2);
		strings.add(s3);
		
		Collections.sort(strings);
		
		for(String s : strings) {
			System.out.println(s);
		}
		
		
	}
}


