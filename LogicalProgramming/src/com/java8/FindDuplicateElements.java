package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class FindDuplicateElements {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

		Set<Integer> uniqueNumbers = new HashSet<>();

		listOfIntegers.stream().filter(num -> !uniqueNumbers.add(num)).forEach(System.out::println);
	}

}
