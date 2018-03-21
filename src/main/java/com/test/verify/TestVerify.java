package com.test.verify;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class TestVerify {

	@Test
	public void test1() {
		try {
			Assert.assertEquals(5, 6);
		} catch (Error err) {
			Reporter.log("expected [6] but found [5]...");
			//err.printStackTrace();
		}
		System.out.println("going on");
	}
}
