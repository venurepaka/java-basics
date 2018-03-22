package com.anagram;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		System.out.println(checkAnagram(s1, s2));
		
//		char[] charArray = s1.toCharArray();
//		Arrays.sort(charArray);
//		String s = new String(charArray);
//		System.out.println(s);
	}

	private static boolean checkAnagram(String s1, String s2) {
		if(s1 == null || s2 == null) return false;
		if(s1.length() != s2.length()) return false;
		char[] charArray1 = s1.toCharArray();
		char[] charArray2 = s2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
	
		s1 = new String(charArray1);
		s2 = new String(charArray2);
		System.out.println(s1);
		System.out.println(s2);
		return s1.equalsIgnoreCase(s2);
		
	}
}
