package com.rest.examples;

import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.ArrayUtils;

public class RemoveDuplicates {
	
	
//	public Set<Integer> removeDuplicateNumbers(int[] numbers) {
//		Set<Integer> s = new HashSet<Integer>();
//		for(int i=0; i<numbers.length; i++) {
//			if( s.add(numbers[i]) ==  false) {
//				System.out.println("duplicate number = "+ numbers[i]);
//			}
//			
//		}
//		return s;
//	}
	
	public int[] removeDuplicateNumbers1(int[] numbers) {
	Set<Integer> s = new HashSet<Integer>();
	int[] numbers1 = null;
	for(int i=0; i<numbers.length; i++) {
		
		if( s.add(numbers[i]) ==  false) {
			
			System.out.println("duplicate number = "+ numbers[i]);
			
			numbers1 = ArrayUtils.remove(numbers, i);
			numbers = numbers1;
			i = i-1;
			System.out.println("");
			
		}
		
	}
	
	return numbers;
	
}
	
	public int removeDuplicateNumbers2(int[] arr, int n) {
		

        // Return, if array is empty
        // or contains a single element
        if (n==0 || n==1)
            return n;
      
        Set<Integer> set = new HashSet<>();
        
        for(int i=0; i< n-1; i++){
        		for(int j=i+1; j<=n-1; j++) {
        			set.add(arr[i]);
        		}
        } 
        System.out.println(set);
        return 0;
		
	}
	
	public int removeDuplicateNumbers(int[] input, int n) {
		int current = input[0];
		boolean found = false;
		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
		return 0;
	}
		
	
	
	
	public static void main(String[] args) {
		int[] nums = new int[] {2,1,2,3,4,4,5,3};
		RemoveDuplicates removeDuplicates = new RemoveDuplicates();
//		Set<Integer> s = removeDuplicates.removeDuplicateNumbers(nums);
//		System.out.println(s); 
		
		int nums1 = removeDuplicates.removeDuplicateNumbers(nums, nums.length);
		System.out.println(nums1);
	}
}
