package com.cox;


public class Test {

	public static void main(String[] args) {
		String str = "hello world";
		String input = "hello";
		//new Test().checkSubString(str, input);
		System.out.println(new Test().checkSubString(str, input));
	}
	
	
	
	
	public boolean checkSubString(String mainStr, String subStr) {
		boolean subString = false;
		
		if(mainStr != null && subStr != null) {
			if(mainStr.contains(subStr)) {
				subString = true;
			}
		}else if(mainStr != null || subStr != null){
			subString = false;
		}
		return subString;
	}
	
	
//	public void checkSubString(String mainStr, String subStr) throws NullPointerException{
//		boolean subString = false;
//		
//		try {
//			mainStr.contains(subStr);
//		} catch (NullPointerException e) {
//			//e.printStackTrace();
//			throw e;
//		} 
//		finally {
//			
//		}
//		
//	}
	
	
	
}
