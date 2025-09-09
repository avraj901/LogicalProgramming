package com.logical.java8;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;

public class PrintTheNumberWithMultipleOfFive {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

		List<Integer> multipleOfFive = listOfIntegers.stream().filter(num -> num % 5 == 0).collect(Collectors.toList());

		System.out.println(multipleOfFive);
	}

}
