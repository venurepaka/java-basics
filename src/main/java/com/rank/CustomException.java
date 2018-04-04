package com.rank;

public class CustomException {
	public static void main(String args[]) {
		try {
			validate(13);
		} catch (InvalidAgeException ie) {
			ie.printStackTrace();
		}
	}

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("invalid age");
	}
}

class InvalidAgeException extends Exception {
	public InvalidAgeException(String invalidAge) {
		super(invalidAge);
	}
}