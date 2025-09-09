package com.logical.java8;
import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		List<Integer> listInteger = Arrays.asList(45,12,56,15,24,75,31,89);
		
	int secondLargestNumber = 	listInteger.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

	System.out.println("SecondLargestNumber::"+secondLargestNumber);
	
	}

}
