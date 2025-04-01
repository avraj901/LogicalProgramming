package com.logical;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountOccurenceofEachCharacter {

	public static void main(String[] args) {
		
		String str= "Hello";
		
		char[] chrArr = str.toCharArray();
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i =0 ; i < chrArr.length ; i++) {
			
			if (map.containsKey(chrArr[i])) {

				int value = map.get(chrArr[i]);

				map.put(chrArr[i], value + 1);
				
			} else {
				
				map.put(chrArr[i], 1);
			}
			
		}
		
		System.out.println(map);
	}
}
