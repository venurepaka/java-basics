package com.test.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;


import java.util.Set;
import java.util.TreeMap;

public class Ex2 {
	private Iterator<Entry<String, String>> it;

	public static void main(String[] args) {
//		new Ex2().setEx();
//		new Ex2().mapEx();
//		new Ex2().sortedMapEx();
		
		breakEx();
		
	}
	
	public static void breakEx() {
		int counter = 0;
		for (counter = 0; counter < 10; counter++) {
			System.out.println(counter);

			if (counter == 4) {
				
				break;
			}
			
			System.out.println("coiunter = 5");
		}
		
		
	}
	public void setEx() {
		// HashSet declaration
				Set<String> hset = new HashSet<String>();

				// Adding elements to the HashSet
				hset.add("Apple");
				hset.add("Mango");
				hset.add("Grapes");
				hset.add("Orange");
				hset.add("Fig");
				// Addition of duplicate elements
				hset.add("Apple");
				hset.add("Mango");
				// Addition of null values
				hset.add(null);
				hset.add(null);

				// Displaying HashSet elements
				System.out.println(hset);
				
			
	}
	
	public void mapEx() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("person1", "address1");
		map.put("person2", "address2");
		map.put("person6", "address6");
		map.put("person3", "address3");
		map.put("person5", "address5");
		map.put("person4", "address4");
		
		
//		it = map.entrySet().iterator(); 
//		while(it.hasNext()) {
//			Entry<String, String> next = it.next();
//			System.out.println(""+next.getKey()+", "+ next.getValue());
//		}
		
//		for(String key : map.keySet()) {
//			System.out.println(map.get(key));
//		}
		
		for(String value : map.values()) {
		System.out.println(value);
	}
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			System.out.println("*** "+map.get(it.next()));
		}
	
	}
	
	
	public void sortedMapEx() {
		Map<String, String> map = new TreeMap<String, String>();
		map.put("person1", "address1");
		map.put("person2", "address2");
		map.put("person3", "address3");
		map.put("person5", "address5");
		map.put("person4", "address4");
		
		
		it = map.entrySet().iterator(); 
		while(it.hasNext()) {
			
			Entry<String, String> next = it.next();
			System.out.println(""+next.getKey()+", "+ next.getValue());
		}
	
	}
	
}
