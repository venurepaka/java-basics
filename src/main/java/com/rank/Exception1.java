package com.rank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Exception1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner scanner = new Scanner(System.in);
	int numerator = scanner.nextInt();// input 5
	int denominator = scanner.nextInt();//input 0
		try {
		int result = numerator/denominator;
		}catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
		
    }
}