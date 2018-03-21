package com.rest.examples;

public class Replace {

	public static void main(String[] args) {
		String original = "I like to watch cricket and movies.";
		
		original = original.replace("and movies.", "only");
		
		System.out.println(original);
	}
	
}
