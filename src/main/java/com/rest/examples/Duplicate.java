package com.rest.examples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.testng.annotations.DataProvider;

import com.test.ExcelUtils;

public class Duplicate {

	public static void main(String[] args) {
		
		new Duplicate().findDuplicates1();
	}
	
	public void findDuplicates() {
		
		String s1 = "doctor,nurse,doctor,patient";
		
		
		Set<String> set = new HashSet<String>();
		for(String s : s1.split(",")) {
			if(set.add(s) == false) {
				System.out.println("duplicate element = "+s); 
			}
		}
		
	}
	
	public void findDuplicates1() {
		int []nums = new int[] {10, 12, 14, 10, 14};
		Set s = new HashSet();
		for(int i=0; i<nums.length; i++) {
			if(s.add(nums[i]) == false)
				System.out.println("duplicate element = "+nums[i]); 
				
		}
		
	}
	
	@DataProvider(name = "test_data_provider")
	public static Object[][] findTestData() throws Exception{
		Object[][] data = ExcelUtils.getTableArray("src/main/resources/Workbook1.xlsx", "Sheet1");
		return data;
		
	}
	
	@org.testng.annotations.Test(dataProvider = "test_data_provider")
	public void testDP(String s1, String s2) {
		System.out.println(s1+", "+s2);
	}
	
	
	
}
