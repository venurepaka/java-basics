package com.test.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClass2 {

		@BeforeTest
	    public void doBeforeTest() {

			System.out.println("before test");

		}
	
	     
	    @Test
	    public void scenario1() {
	
	        System.out.println("in test");
	
	    }
	    
	    @AfterTest
	    public void doAfterTest() {
	
	        System.out.println("after test");
	
	    }

}
