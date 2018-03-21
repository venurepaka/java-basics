package com.junit.ex;


import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;


public class TestUsingJUnit{

	int[] arr1 = {1,2,3,4};
	int[] arr2 = {1,2,3,4};
	   @Test
	   public void testPrintMessage() {	
	      assertEquals("abc", "abc");     
	   }
	   
	   @Test
	   public void testPrintMessage2() {	
	      assertArrayEquals(arr1, arr2);
	   }
	
	  
	   public static void compare(int[]arr1, int[] arr2) {
		   if (Arrays.toString(arr1).equals(Arrays.toString(arr2)))
				   System.out.println("true");
	   }
	   
	   public static void main(String[] args) {
		   int[] arr1 = {1,2,3,4};
			int[] arr2 = {1,2,3,4};
		   compare(arr1, arr2);
	}
	
}
