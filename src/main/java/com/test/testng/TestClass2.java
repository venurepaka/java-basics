package com.test.testng;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {

	@BeforeTest
	
	    public void doBeforeTest() {
	
	        System.out.println("testClass2: before test");
	
	    }
	
	     
	
	    @Test
	
	    public void scenario1() {
	
	        System.out.println("testClass2: scenario1");
	
	    }

}
