package com.factorial;

public class Factorial {

	public static void main(String[] args) {
		getFactorial(4);
		int num = 4;
		int sumOfFactorial=0;
		/**
		 * sum of 1,2,3,4 factorials
		 */
		for(int i=1; i<=num; i++) {
			//getFactorial(i);
			//System.out.println(getFactorial(i));
			sumOfFactorial = sumOfFactorial+getFactorial(i);
		}
		
		System.out.println(sumOfFactorial);
		
	}
	
	public static int getFactorial(int x) {
		int factorial=1;
		if(x==0) return 1;
		if(x<=0) return -1;
		for(int i=1; i<=x; i++) {
			factorial = factorial *i;
		}
		return factorial;
	}
	
//	public static void getFactorial(int x) {
//		int factorial=1;
//		
//		for(int i=1; i<=x; i++) {
//			factorial = factorial *i;
//		}
//		
//	}
	
}
