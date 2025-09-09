package com.logical.java8;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class FindMaximumAndMinimumOfNumbers {

	public static void main(String[] args) {
		

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		int maxNumber =	listOfIntegers.stream().max(Comparator.naturalOrder()).get();
		
		System.out.println("maxNumber: "+maxNumber);
		
		int minNumbers = listOfIntegers.stream().min(Comparator.reverseOrder()).get();
		
		System.out.println("minNumbers : "+ minNumbers);
	}

}
