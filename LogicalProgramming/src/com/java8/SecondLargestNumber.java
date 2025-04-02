package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

		Optional<Integer> secondLargest = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

		System.out.println(secondLargest.get());

	}

}
