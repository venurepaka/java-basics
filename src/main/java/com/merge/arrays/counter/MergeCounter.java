package com.merge.arrays.counter;

import java.util.HashMap;
import java.util.Map;


public class MergeCounter {
	public static void main(String[] args) {

		int[] array1 = new int[] { 1, 2, 1, 5 };
		int[] array2 = new int[] { 1, 3, 3, 4, 5 };

		new MergeCounter().mergeCounter(array1, array2);
		Double[] dbr = new Double[] { 1.0, 2.0, 1.0, 5.0 };
		Map<Double, Double> mergeCounter1 = new MergeCounter().mergeCounter1(dbr, dbr);
	}

	
	public <T> Map<T, T> mergeCounter1(T[] arr1, T[] arr2) {
		return null;
		
	}
	public Map<Integer, Integer> mergeCounter(int[] arr1, int[] arr2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int size = ((arr1 != null)?arr1.length:0) + ((arr2 != null)?arr2.length:0);
		boolean isNeg1 = false, isNeg2 = false;
		if (size >= 1 && size <= 10000) {
			
			// iterate over arr1 and arr2. If any of those numbers are negative, don't proceed.
			if(arr1 != null) {
				for(int x: arr1) {
					if(x <= 0) isNeg1 = true;
				}
			}
			if(arr2 != null) {
				for(int y: arr2) {
					if(y <= 0) isNeg2 = true;
				}
			}
			
			if(isNeg1==false && isNeg2==false) {
				int i=0;int j=0;
				for (int k=0;k<size;k++) {
					
					if (arr1 != null && i <= arr1.length - 1) {
						addOrPutToMap(arr1, map, i++);
					}
	
					if (arr2 != null && j <= arr2.length - 1) {
						addOrPutToMap(arr2, map, j++);
					}
	
				}
			}else if(isNeg1==false && isNeg2==true){System.out.println("invalid second array"); map = null;}
			else if(isNeg2==false && isNeg1==true){System.out.println("invalid first array"); map = null;}
			else if(isNeg2==true && isNeg1==true){System.out.println("invalid first and second array"); map = null;}
		}else if(size == 0 || size > 10000) {
			map = null;
		}
		
System.out.println(map);
		return map;
	}

	private void addOrPutToMap(int[] inputArr, Map<Integer, Integer> outputMap, int i) {
		int counter =1;
			
			if (outputMap.containsKey(inputArr[i ])) {
				counter = outputMap.get(inputArr[i ]);
				counter++;
				outputMap.put(inputArr[i ], counter);
			} else {
				outputMap.put(inputArr[i ], counter);
			}
			

	} 


}
