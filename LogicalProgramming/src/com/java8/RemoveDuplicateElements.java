package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {

		List<Integer> listOfNumbers = Arrays.asList(2, 3, 4, 5, 6, 7, 2, 3, 4, 5);

		List<Integer> uniqueNumbers = listOfNumbers.stream().distinct().collect(Collectors.toList());

		System.out.println(uniqueNumbers);
	}
}
