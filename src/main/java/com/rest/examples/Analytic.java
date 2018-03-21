package com.rest.examples;

public class Analytic {

	public static void main(String[] args) {
		int[] nums = {4,6,4,13,5,7};
		new Analytic().getPrimeNums(nums);
	}
	
	public void getPrimeNums(int arr[]) {
		
		for(int i=0; i<arr.length; i++) {
			
			getPrime(arr[i]);
		}
	}
	
	public void getPrime(int num) {
		int count=0;
		for(int j=1; j<=num; j++) {
			if(num%j == 0) {
				count+=1;
			}
			
		}
		if(count == 2)
			System.out.println("prime ="+num);
		else
		 System.out.println("not a prime ="+num);
	}
	
}
