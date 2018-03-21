package com.rest.testng.examples;

import org.testng.annotations.Test;

public class TestMethods {

//	@Test(groups = {"group1"})
//	public void t1() {
//		System.out.println("in t1");
//	}
//	
//	@Test(dependsOnGroups= {"group1"})
//	public void t2() {
//		System.out.println("in t2");
//	}
	
	@Test
	public void testParent() {
		System.out.println("in test3");
	}
	
	@Test(dependsOnMethods= {"testParent"})
	public void testChild() {
		System.out.println("in test4");
	}
	
//	
//	@Test(invocationCount=5, threadPoolSize=2)
//	public void test4() {
//		System.out.println("in multi threading testing");
//	}
	
	
	
}
