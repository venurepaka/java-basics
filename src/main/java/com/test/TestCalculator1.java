package com.test;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator1 {

	CalculatorService1 calc = null;
	
	@BeforeTest
	public void before() {
		 calc = new CalculatorService1Impl();
	}
	
	@Test
	public void testMultiply() {
		assertEquals(20, calc.multiply(5, 4));
	}
	
}
