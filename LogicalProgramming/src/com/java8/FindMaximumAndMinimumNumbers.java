package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;
import java.util.Optional;

public class FindMaximumAndMinimumNumbers {

	public static void main(String[] args) {

		List<Integer> listOfInteges = Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 1);

		Optional<Integer> maxValue = listOfInteges.stream().max(Comparator.naturalOrder());

		System.out.println("max number : " + maxValue.get());

		Optional<Integer> minValue = listOfInteges.stream().min(Comparator.naturalOrder());

		System.out.println("min number : " + minValue.get());
	}
}
