package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

public class ThreeMaximumAndThreeMinimumNumbers {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

		System.out.println("max numbers : ");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(num -> {

			System.out.println(num);
		});

	}
}
