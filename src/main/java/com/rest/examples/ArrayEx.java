package com.rest.examples;

public class ArrayEx {

	public static void main(String[] args) {
		ArrayEx ex =new ArrayEx();
		double[] vals = new double[] {9.5, 13.5, 6.0, 1.0, 3.0};
//		System.out.println("sum = "+ex.getSum(vals));
//		System.out.println("biggest num = "+ex.findBiggestNum(vals));
		
		int[][] inputArr =  new int[][] {
										{2,4,6},
										{8,9,6},
										{1,2,5},
										{5,0,9}}; 
		System.out.println("multi dimensional array = "+ex.printMulti(inputArr));
		
	}
	
	public int[][] printMulti(int[][] inputArr) {
		
		int[][] outputArr = new int[4][3];
		int rows = 4, columns=3;
		for(int i=0; i<rows; i++) {
			
			for(int j=0; j<columns; j++) {
				outputArr[i][j] = inputArr[i][j];
				System.out.print(outputArr[i][j]+" ");
			}
			System.out.println("");
		}
		return outputArr;
	}
	
	public double getSum(double[] nums) {
		double sum = 0;
		if(nums.length == 0)
			return sum;
		for(int i=0; i<nums.length; i++) {
			sum= sum + nums[i];
		}
		return sum;
	}
	
	public double findBiggestNum(double[] nums) {
		double biggest = nums[0];
		for(int i=1; i<nums.length; i++) {
			if(nums[i] > biggest)
				biggest = nums[i];
					
		}
		return biggest;
	}
	}