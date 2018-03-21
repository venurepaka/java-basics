package com.cox.test;

import static org.junit.Assert.*;
import java.util.HashMap;
import java.util.Map;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cox.MergeCounter;

public class MergeCounterTest {

	private static MergeCounter mergeCounter;
	
	@BeforeClass
	public static void setUp(){
		mergeCounter = new MergeCounter();
	}
	
	@AfterClass
	public static void tearDown(){
		mergeCounter = null;
	}
	
	@Test
	public void testMergeCounterForPositiveScenario() {
		int[] array1 = new int[] {1,2,1,5};
		int[] array2 = new int[] {1,3,3,4,5};
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		
		inputMap.put(1, 3);
		inputMap.put(2, 1);
		inputMap.put(5, 2);
		inputMap.put(3, 2);
		inputMap.put(4, 1);
		
		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNotNull(responseMap);
		assertEquals(responseMap.size(), inputMap.size());
		assertTrue(inputMap.equals(responseMap)); 
		
	}
	
	@Test
	public void testMergeCounterWhenFirstArrayHasNegativeNumbers() {
		int[] array1 = new int[] {1,2,1,-5};
		int[] array2 = new int[] {1,3,3,4,5};
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();

		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNull(responseMap);
	}
	
	@Test
	public void testMergeCounterWhenSecondArrayHasNegativeNumbers() {
		int[] array1 = new int[] {1,2,1,5};
		int[] array2 = new int[] {-1,3,3,4,5};
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();

		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNull(responseMap);
	}
	
	@Test
	public void testMergeCounterWhenBothArraysHaveNegativeNumbers() {
		int[] array1 = new int[] {1,2,1,-5};
		int[] array2 = new int[] {-1,3,3,4,5};
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();

		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNull(responseMap);
	}
	
	@Test
	public void testMergeCounterWhenFirstArrayIsEmpty() {
		int[] array1 = new int[] {};
		int[] array2 = new int[] {1,3,3,4,5};
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		
		inputMap.put(1, 1);
		inputMap.put(3, 2);
		inputMap.put(5, 1);
		inputMap.put(4, 1);
		
		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNotNull(responseMap);
		assertEquals(responseMap.size(), inputMap.size());
		assertTrue(inputMap.equals(responseMap)); 
		
	}
	
	@Test
	public void testMergeCounterWhenSecondArrayIsEmpty() {
		int[] array1 = new int[] {1,8,8,3,4,4};
		int[] array2 = new int[] {};
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		
		inputMap.put(1, 1);
		inputMap.put(8, 2);
		inputMap.put(3, 1);
		inputMap.put(4, 2);
		
		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNotNull(responseMap);
		assertEquals(responseMap.size(), inputMap.size());
		assertTrue(inputMap.equals(responseMap)); 
		
	}
	
	@Test
	public void testMergeCounterWhenBothEmpty() {
		int[] array1 = new int[] {};
		int[] array2 = new int[] {};
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		
		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNull(responseMap); 
		
	}

	@Test
	public void testMergeCounterWhenFirstArrayIsNull() {
		int[] array1 = null;
		int[] array2 = new int[] {1,3,3,4,5};
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		
		inputMap.put(1, 1);
		inputMap.put(3, 2);
		inputMap.put(5, 1);
		inputMap.put(4, 1);
		
		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNotNull(responseMap); 
		assertEquals(responseMap.size(), inputMap.size());
		assertTrue(inputMap.equals(responseMap)); 
		
	}
	
	
	
	@Test
	public void testMergeCounterWhenSecondArrayIsNull() {
		int[] array1 = new int[] {1,3,3,4,5};
		int[] array2 = null;
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		
		inputMap.put(1, 1);
		inputMap.put(3, 2);
		inputMap.put(5, 1);
		inputMap.put(4, 1);
		
		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNotNull(responseMap); 
		assertEquals(responseMap.size(), inputMap.size());
		assertTrue(inputMap.equals(responseMap)); 
		
		
	}
	
	@Test
	public void testMergeCounterForBigArray() {
		
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		int[] array1 = new int[10001];
		int[] array2 = null;
		
		for(int i=0; i<=array1.length-1; i++) {
			array1[i] = 1;
			
		}

		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNull(responseMap);
		
		
	}
	
	@Test
	public void testMergeCounterForBigArrayWihtSecondArray() {
		
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		int[] array1 = new int[10001];
		int[] array2 = new int[] {4,6,7,8,9,8,9};
		
		for(int i=0; i<=array1.length-1; i++) {
			array1[i] = 1;
		}

		responseMap = mergeCounter.mergeCounter(array1, array2);
		assertNull(responseMap);
	}
	
	
	@Test
	public void testMergeCounterWithBoundaryAnalysisWhenSecondArrayIsNull() {
		
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		int[] array1 = new int[10000];
		int[] array2 = null;
		for(int i=0; i<=array1.length-1; i++) {
			array1[i] = 1;
		}
		
		inputMap.put(1, 10000);
		responseMap = mergeCounter.mergeCounter(array1, array2);
		
		assertNotNull(responseMap);
		
		assertTrue(inputMap.equals(responseMap));
		

		
	}
	
	@Test
	public void testMergeCounterWithBoundaryAnalysisWithSecondArray() {
		
		Map<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		Map<Integer, Integer> responseMap = new HashMap<Integer, Integer>();
		int[] array1 = new int[10000];
		int[] array2 = new int[] {5,5,6,7,8,8}; 
		for(int i=0; i<=array1.length-1; i++) {
			array1[i] = 1;
		}
		inputMap.put(1, 10000);
		inputMap.put(5, 2);
		inputMap.put(6, 1);
		inputMap.put(7, 1);
		inputMap.put(8, 2);

		responseMap = mergeCounter.mergeCounter(array1, array2);
		
		assertNull(responseMap);
		assertTrue(!inputMap.equals(responseMap));
		
		
	}
	
}
