package com.logical.java8;
import java.util.List;
import java.util.Arrays;
import java.util.Comparator;

public class FindThreeMaximumAndThreeMinimum {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		listOfIntegers.stream().sorted().forEach(System.out::println);

		System.out.println("=================================");

		listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

		System.out.println("===================================");

		listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);

	}

}
