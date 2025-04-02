package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitsOfANumber {

	public static void main(String[] args) {

		int i = 1245;

		int sum = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

		System.out.println("sum : " + sum);
	}

}
