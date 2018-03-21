package com.basic.java.questions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TestC {
	
	public static void main(String[] args) {
		 //mergeCounter();
		getLast3MostOccurancesInASentence("Hi how are you I am good I can see that I will meet you later good bye");
		
//		String output = removeSpaces(null);
//		System.out.println(output);
		
		
//		String str="Hi how are you. I am good. I can see that. I will meet you later good bye";
//		str = str.replace("[. ]", "").trim();
//		System.out.println(str);
		
	}

	
	public static void getLast3MostOccurancesInASentence(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> map = new TreeMap<>();
		int count = 0;
		for(int i=0; i<words.length; i++) {
			if(map.containsKey(words[i])) {
				count = map.get(words[i]);
				count++;
				map.put(words[i], count);
			}else {
				map.put(words[i], 1);
			}
		}
		
		System.out.println(map);
		
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
	    List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(entrySet);

		Collections.sort(list, new ValueComparator());
		
//		for(Entry<String, Integer> entry : list) {
//			System.err.println(entry.getKey());
//		}
		
		System.out.println(list);
		
		for(int i=0; i<=list.size()-1; i++) {
			if(i == 3) break;
			System.err.println(list.get(i));
			
		}
			
	}
	
	
	
	public static String removeSpaces(String str) {
		String strWithNoSpaces = null;
		
		if(str!= null && str.length() >0) {
			String[] strings = str.split(" ");
			StringBuffer sb = new StringBuffer();
			for(int i=0; i<strings.length; i++) {
				sb.append(strings[i]);
			}
			strWithNoSpaces = sb.toString();
		}
		else {
			strWithNoSpaces = "Input String is empty or null";
		}
		return strWithNoSpaces;
		
	}

	public static void mergeCounter() {
		
	}
	
	
}

class ValueComparator implements Comparator<Map.Entry<String,Integer>>{

	@Override
	public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
		return  o2.getValue().compareTo(o1.getValue());
		
		
	}
	
}

