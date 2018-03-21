package com.basic.java.questions;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;


public class TestB {

	public static void sortArray(int[] nums) {
		
		boolean isSorted = false;
		while(!isSorted) {
			isSorted = true;
			for(int i=0; i<nums.length-1; i++) {
				if(nums[i] > nums[i+1]) {
					swap(nums, i, i+1);
					isSorted = false;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}

	
	
	public static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	
	}

	public static void reverseSentenseWithWords(String sentence) {
		String[] words = sentence.split(" ");
		StringBuffer sb = new StringBuffer();
		for( int i=words.length-1; i>=0; i--) {
			sb.append(words[i]);
			sb.append(" ");
		}
		
		System.out.println(sb.toString());
	}
	
	public static void reverseSentense(String sentence) {
		
		StringBuffer sb = new StringBuffer();
		String rev = "";
		for(int i=sentence.length()-1; i>=0; i--) {
			rev = rev + sentence.charAt(i);
			
		}
		System.out.println(rev);
	}
	
	public static String reverseSentenseR(String sentence) {
		
		
		StringBuffer sb = new StringBuffer();
		String rev = "";
		for(int i=sentence.length()-1; i>=0; i--) {
			rev = rev + sentence.charAt(i);
			
		}
		System.out.println(rev);
		
		return rev;
	}
	
	public static void reverseSentense1(String sentence) {
		
		
		String rev = "";
		for(int i=sentence.length()-1; i>=0; i--) {
			rev = rev + sentence.charAt(i);
		}
		System.out.println(rev);
	}
	
	public static void findDuplicates(int[] dup) {
		Set<Integer> uniqueIntegers = new HashSet<Integer>();
		
		
		
		for(int i=0; i<dup.length; i++) {
			if(uniqueIntegers.add(dup[i]) == false) {
				System.out.println("dup = "+dup[i]);
			}
		}
		System.out.println(uniqueIntegers);
		
	}
	
	
	public static boolean findDups(int[] dups) {
		
		boolean dupExists = false;
		for(int i=0; i<dups.length; i++) {
			for(int j=i+1; j<dups.length; j++) {
				if(dups[i] == dups[j]) {
					System.out.println("dup = "+dups[i]);
					dupExists = true;
				}
			}
		}
		return dupExists;
		
		
	}
	//hi hello hi
	public static void findDUplicateWords(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		int count=0;
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				count = map.get(arr[i]);
				count = count + 1;
				map.put(arr[i], count);
			}
			else
				map.put(arr[i], 1);
		}
		
		System.out.println(map);
		
	}
	
	public static int findDuplicateCount(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			if(set.add(arr[i]) == false){
				count+=1;
			}
			
		}
		System.out.println(count);
		return count;
	}
	
	public static void main3(String[] args) {
		int[] dupArray = new int[] {4,5,6,3,4,8,6,8,9};
		//System.out.println(findDups(dupArray));
		String str = "My first name is Super, last name is duper and middle name is star";
		findDUplicateWords(str);
		
		int[] arr = new int[] {4,5,6,6,7,7};
		//findDuplicateCount(arr);
	}
	
	
	
	public static void main(String[] args) {

		int[] inputArr = new int[] { 5, 4, 6, 7, 8, 2, 1 };
		sortArray(inputArr);
		
		String sentence = "hi how are you";
		String sentence1 = "hi, my name is star.";
		
		//reverseSentenseWithWords(sentence);
		//reverseSentense(sentence);
		//reverseSentense1(sentence1);
		
		int[] dupArray = new int[] {4,5,6,3,7};
		//findDuplicates(dupArray);
		
	}
	
	public static void findBiggest(int[] arr) {
		int biggest = arr[0];
		
		for(int i=1; i< arr.length; i++) {
			if(arr[i] > biggest)
				biggest = arr[i];
		}
		System.out.println(biggest);
	}
	
	public static void main2(String[] args) {
		//find the biggest num
		//find the 2nd biggest num
		//find the top 5 frequently coming words in a sentence.
		int[] arr = new int[] {2,11,3,10,7,6,9,8};
		findBiggest(arr);
		
	}
	public static void convert() {
		int x = 5;
		String str = String.valueOf(x);
//		System.out.println(str);
		
		String abc = Integer.toString(x) + "abc";
		System.out.println(abc);
		
	}
	
	
	
	public static void main5(String[] args) {
		//convert();
		//writeSingletonClass();
		
	}
	

}
