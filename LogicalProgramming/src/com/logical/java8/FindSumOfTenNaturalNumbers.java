package com.logical.java8;
import java.util.stream.*;

public class FindSumOfTenNaturalNumbers {

	public static void main(String[] args) {

		IntStream.range(0, 10).forEach(System.out::println);

		int sum = IntStream.range(0, 10).sum();
		
		System.out.println(sum);

	}

}
