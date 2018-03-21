package com.test;

import static org.testng.Assert.*;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCalculator {

	CalculatorService calc = null;
	@BeforeTest
	public void before() {
		 calc = new CalculatorServiceImpl();
	}
	
	@Test
	public void testAdd() {
		assertEquals(9, calc.add(5, 4));
	}
	
}
