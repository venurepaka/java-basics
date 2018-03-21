package com.basic.java.questions;

import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import com.rest.SortStrings;


public class TestA {

	public static void sortArray(int[] nums) {
//		Arrays.sort(nums);
//		System.out.println(Arrays.toString(nums));
		
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
		System.out.println(nums[0]+" , "+nums[nums.length-2]);
		
	}

	public static void swap(int arr[], int x, int y) {
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}

	public static void reverseSentenseWithWords(String sentence) {
		String[] sentSplit = sentence.split(" ");
		StringBuffer sb = new StringBuffer();
		for(int i=sentSplit.length-1; i>=0; i--) {
			sb.append(sentSplit[i]);
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
	
	
	public static void findDups(int[] dups) {
		
		for(int i=0; i<dups.length; i++) {
			for(int j=i+1; j<dups.length; j++) {
				if(dups[i] == dups[j]){
					System.out.println("dups are ="+dups[i]);
				}
			}
			
		}
		
		
	}
	
	public static void findDUplicateWords(String str) {
		String[] arr = str.split(" ");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<arr.length; i++) {
			if(map.containsKey(arr[i])) {
				Integer count = map.get(arr[i]);
				count+=1;
				map.put(arr[i], count);
			}else {
				map.put(arr[i], 1);
			}
		}
		System.out.println(map);
		
	}
	
	public static int findDuplicateCount(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		int dupCount = 0;
		int count = 0;
		//boolean duplicate = false;
		for(int i=0; i<arr.length; i++) {
			
			if(set.add(arr[i]) == false){
				count+=1;
				//duplicate = true;
				 
			}
			if (count == 2 ) {
				++dupCount;
				System.out.println("dups are = "+arr[i]);	 
			}
			
		}
		System.out.println(dupCount);
		return dupCount;
	}
	
//	public static String sortString(String str) {
//		char[] charArr = str.toCharArray();
//		Arrays.sort(charArr);
//		System.out.println(Arrays.toString(charArr));
//		return Arrays.toString(charArr);
//
//	}
	
	public static void sortString(String str) {
		
		Character[] chars = new Character[str.length()];
		for(int i=0; i<str.length(); i++) {
			chars[i] = str.charAt(i);
		}
		
		Arrays.sort(chars);
		System.out.println(chars.toString());
	}
	
	static class CharComparator implements Comparator<Character>{
		@Override
		public int compare(Character c1, Character c2) {
			if (c1 < c2) return -1;
			
			else if (c1 > c2) return 1;
			
			else return 0;
		}

		
	}
	
	 public static void print2DArr(int[][] arr2d) {
		 
//		 int rows = 3, columns = 4;
//		 for(int i=0; i<rows; i++) {
//			 for(int j=0; j<columns; j++) {
//				 if(j != (columns-1))
//				 System.out.print(arr2d[i][j]+",");
//				 if(j == (columns-1))
//					 System.out.print(arr2d[i][j]);
//			 }
//			 System.out.println("");
//		 }
		 
//		 for(int[] row: arr2d) {
//			 System.out.println(Arrays.toString(row));
//		 } 
		 
		 
		 
		 //int rows = 3, columns = 4;
		 for(int i=0; i<arr2d.length; i++) {
			 for(int j=0; j<arr2d[i].length; j++) {
				 if(j != (arr2d[i].length-1))
				 System.out.print(arr2d[i][j]+",");
				 if(j == (arr2d[i].length-1))
					 System.out.print(arr2d[i][j]);
			 }
			 System.out.println("");
		 }
		 
	 }
	 
	 
	 public static String sortString1(String inputString)
	    {
	        // convert input string to char array
	        char tempArray[] = inputString.toCharArray();
	         
	        // sort tempArray
	        Arrays.sort(tempArray);
	         
	        // return new sorted string
	        return new String(tempArray);
	    }
	 
	public static void main(String[] args) {
		//int[] dupArray = new int[] {4,5,6,4,5};
		
//		String inputString = "geeksforgeeks";
//        String outputString = sortString1(inputString);
//         
//        System.out.println("Input String : " + inputString);
//        System.out.println("Output String : " + outputString);
        
		//findDups(dupArray);
		//String str = "My first name is Super, last name is duper and middle name is star.";
		//findDUplicateWords(str);
		
		int[] arr = new int[] {4,5,6,6,6,7,7};
		//findDuplicateCount(arr);
		//sortString("hihowareyou");
		
	        int mat[][] = { { 1, 2, 3, 4 },
	                        { 5, 6, 7, 8 },
	                        { 9, 10, 11, 12 },
	                        { 9, 10, 11, 12 },
	                        { 9, 10, 11, 12 }};
	       
	    
	//print2DArr(mat);
	        //sortString("GeeksforGeeks");
	        //System.out.println(isPrime(27));
	        
	        //System.out.println(fib(9));
	        
	       // System.out.println(odd(90));
	        
	        int x=5;
	        int y= x/2;
	        //System.out.println(y);
	        //str = "madam1";
	        //System.out.println(palindrome(str));
	        
//	        String str1 = "ven";
//	        System.out.println(str1.substring(1)+str1.charAt(0)); //env
//		String str1 = "english";
//		System.out.println(str1.substring(1)); //ne +
//	        
//	        
//	        String str2 = "1234";
	        
	        //System.out.println(reverse(str2));
	        
	        odd(5);
	        
	}
	//0 1 1 2 3 5 8 13 21 34
	
	public static String reverse(String str) {
		
		if(str!=null & str.length() >0) {
			String rev = str.substring(1);
			char ch = str.charAt(0);
			return reverse(rev) + ch;
		} else if(str.length() == 0) {
			return str;
		}
		return str;
	}
	
	public static void palindrome1(String str ) {
		
		int middleIndex = str.length()/2+1;
		String firstStr = "";
		String secondStr = "";
		for(int x=0; x<=middleIndex-2; x++) {
			firstStr = firstStr +str.charAt(x);
		}
		for(int y=str.length()-1; y>=middleIndex; y--) {
			secondStr = secondStr +str.charAt(y);
		}
		System.out.println(firstStr);
		System.out.println(secondStr);
		
	}
	
public static boolean palindrome(String str ) {
		
		for(int i=0, j=str.length()-1; i<=j; i++,j--) {
			if(str.charAt(i) == str.charAt(j)) {
				return true;
			}
		}
		return false;
	}
	
	
	public static int  fib(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		int result = fib(n-1) + fib(n-2);
		
		return result;
		
		
	}
	
	public static boolean odd(int n) {
		boolean flag = false;
		
		if(n %2 ==0) flag = false;
		else flag = true;
		System.out.println(flag);
		return flag;
		
		
		
	}
	
	
	public static boolean isPrime(int x) {
		int count = 0;
		for(int i=1 ; i<=x; i++) {
			if(x%i==0) {
				count+=1;
				}
		}
		if (count == 2) return true;
		
		return false;
	}
	
	public static void main5(String[] args) {

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
		for(int i=1; i<arr.length; i++) {
			if( arr[i] > biggest ) {
				biggest = arr[i];
			}
		}
		System.out.println(biggest);
		
	}
	
	public static void main3(String[] args) {
		//find the biggest num
		//find the 2nd biggest num
		//find the top 5 frequently coming words in a sentence.
		int[] arr = new int[] {2,4,3,10,7,6,9,8};
		findBiggest(arr);
		
	}
	public static void convert() {
		int x = 5;
		String str = String.valueOf(x);
//		System.out.println(str);
		
		String abc = Integer.toString(x) + "abc";
		System.out.println(abc);
		
	}
	
	
	
	public static void main2(String[] args) {
		//convert();
		//writeSingletonClass();
		
	}
	

}
