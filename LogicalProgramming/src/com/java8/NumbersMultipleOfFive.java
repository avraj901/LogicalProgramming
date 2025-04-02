package com.java8;

import java.util.Arrays;
import java.util.List;

public class NumbersMultipleOfFive {
	
	public static void main(String[] args) {
		
		List<Integer> listOfIntegers = Arrays.asList(4,5,10,15,3,7,8,9);
		
		listOfIntegers.stream().filter(num -> num%5==0).forEach(System.out::println);
	}
	
	
}
