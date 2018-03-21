package com.rest.examples;

public class Fibonacci {
public static void main(String[] args) {
	System.out.println(new Fibonacci().getFibonacci_rec(7));

//	for(int i=1; i<=10; i++)
//	{ System.out.print(getFibonacci(i) +" "); }
}

public static int getFibonacci(int num){
	if(num==1 || num==2) {
		return 1;
	}
	int fib1 =1,  fib2=1, fib=1;
	
	for(int i = 3; i<=num; i++) {
		fib = fib1 + fib2;
		fib1 = fib2;
		fib2 = fib;
	}
	return fib;
}

public int getFibonacci_rec(int num) {
	if(num==0) return 0;
	if(num==1) return 1;
	int fib = getFibonacci_rec(num-1)+getFibonacci_rec(num-2);
	
	return fib;
	
}

}
