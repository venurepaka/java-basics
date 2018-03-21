package com.sort.algorithms;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {  5, 4, 6, 3, 8, 2, 1 };
		new BubbleSort().getSortedArray(arr);
	}

	public void getSortedArray(int[] arr1) {
		boolean isSorted = false;
		while(!isSorted) {
		isSorted = true;
			for(int i=0; i<arr1.length-1; i++) {
				if(arr1[i] > arr1[i+1]) {
					swap(arr1, i, i+1); 
					isSorted = false;
				}
				
			}
			
//			if(isSorted == true)
//				System.out.println("sorted = "+arr1[0]+", "+arr1[5]);
		}
		
		if(isSorted == true)
			System.out.println(Arrays.toString(arr1));
		
	}

	public void swap(int[] sw, int i, int j) {
		int temp = sw[i];
		sw[i] = sw[j];
		sw[j] = temp;

	}

}
