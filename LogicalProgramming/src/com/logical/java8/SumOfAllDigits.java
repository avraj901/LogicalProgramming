package com.logical.java8;
import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigits {

	public static void main(String[] args) {

		int i = 12345;

		String str = String.valueOf(i);

		int sum = Arrays.stream(str.split("")).collect(Collectors.summingInt(Integer::parseInt));

		System.out.println(sum);

	}

}
