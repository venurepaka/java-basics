package com.rest;

public class Reverse {

	public void reverse() {
		String str = "Hi how are you";
		
		StringBuilder sb = new StringBuilder();
		sb.append(str);
		System.out.println(sb.reverse());
	}
	
	
	public void reverse_1() {
//		String str = "abcdefghijkl";
//		String rev ="";
//		for(int i=str.length()-1; i>=0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
		
		
		String str = "asfjassj123";
		String rev = "";
		for(int i=str.length()-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		System.out.println(rev);
	}
	
	public String reverseString(String str)
    {
		System.out.println("Unwinding : "+str);
        if (str.isEmpty()) {
            return str;
        }
        //Calling Function Recursively
        String rev = str.substring(1);
        //System.out.println("Rv :"+rev);
		char added = str.charAt(0);
		return reverseString(rev) + added;
    }
	
	public static void main(String[] args) {
		Reverse rv = new Reverse();
		
		//rv.reverse();
		//rv.reverse_1();
		String st = rv.reverseString("stack");
		System.out.println(st);
		
//		String str = "c";
//		System.out.println(str.substring(1));
		//System.out.println(str.indexOf("c"));
	
	}
}
