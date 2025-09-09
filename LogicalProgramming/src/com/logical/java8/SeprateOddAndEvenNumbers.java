package com.logical.java8;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SeprateOddAndEvenNumbers {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 34, 5, 6, 78, 9 };

		Map<Boolean, List<Integer>> output = Arrays.stream(numbers).boxed()
				.collect(Collectors.partitioningBy(num -> num % 2 == 0));

		for (Entry<Boolean, List<Integer>> result : output.entrySet()) {

			if (result.getKey()) {
				System.out.println("Even Numbers : ");
			} else {
				System.out.println("Odd Numbers : ");
			}
			for (int i : result.getValue()) {
				System.out.println(i);
			}
		}

	}

}
