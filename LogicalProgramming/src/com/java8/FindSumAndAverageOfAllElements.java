package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindSumAndAverageOfAllElements {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89 );

		int sum = listOfIntegers.stream().mapToInt(Integer::intValue).sum();

		System.out.println("sum : " + sum);

		double averageValue = listOfIntegers.stream().mapToInt(Integer::intValue).average().getAsDouble();

		System.out.println("avearage  : " + averageValue);

		int[] a = new int[] { 45, 12, 56, 15, 24, 75, 31, 89 };

		int sumValue = Arrays.stream(a).sum();

		System.out.println(sumValue);

		double averageVal = Arrays.stream(a).average().getAsDouble();

		System.out.println(averageVal);
	}

}
