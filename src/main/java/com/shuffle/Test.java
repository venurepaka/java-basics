package com.shuffle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		//int[] input = new int[];
		 shuffle(new int[] {5,7,3,9,8,12});
		 
		// printRandomNums();
		//double d = Math.random();
		//System.out.println(d);
		
		//swapWithout3rd();
		//removeZero("000123");
		
		//String str = "000123";
		//StringBuffer sb = new StringBuffer("000123");
		//System.out.println(sb.replace(0, 2, ""));
		
		String[] arr = {"graceful", "grace", "disgraceful"};
		//findCommonWord(arr);
		 
	}
	
	public static void findCommonWord(String[] arr) {
		
	}
	
	
	public static void removeZero(String str) {
		StringBuffer sb = new StringBuffer(str);
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i) == '0')
				
			sb.replace(0, i, "");
		}
		System.out.println(sb);
	}
	
	public static void swapWithout3rd() {
		String a = "hello";
		String b = "world";
		
		String c;
		
//		c = a;
//		a=b;
//		b=c;
//		
//		System.out.println(a);
//		System.out.println(b);
		
		//helloworld - world
		a = a+b; //helloworld
		b = a.substring(0, a.length()-b.length());//hello
		a = a.substring(b.length(), a.length());//world
		
		System.out.println(a);
		System.out.println(b);
		
	}
	/**
	 * 5 7 3 9 12 23
	 * r=2
	 * 3 7 5 9 12 23
	 * r=2
	 * 
	 * 
	 * @param arr
	 * @throws InterruptedException
	 */
	
public static void shuffle(int[] arr) throws InterruptedException {
	 Random random = new Random();
	 int temp=0;
	for(int i=0; i<arr.length; i++) {
		int randomInt = random.nextInt(arr.length);
		swap(arr, i, randomInt);
		
	
	}
	System.out.println("*** "+Arrays.toString(arr));
	
}
	private static void swap(int[] arr, int i, int randomInt) {
		int temp;
		temp = arr[i];
		arr[i]=arr[randomInt];
		arr[randomInt] = temp;
	}	

 public static void shuffle1(int[] arr){
	 int j=0;
	 List<Integer> ints = new ArrayList<Integer>();
		for(int i=0; i<=arr.length-1; i++) {
			//j = (int)Math.floor(Math.random()*arr.length);
			//arr[i] = arr[j];
			ints.add(arr[i]);
		}
		
		//System.out.println("*** = "+Arrays.toString(arr));
		Collections.shuffle(ints);
		System.out.println(ints.toString());
		
	}
 
 public static void printRandomNums() {
	 int x = 0;
	 Random random = new Random();
	 System.out.println(random.nextInt(6));
 }

}
