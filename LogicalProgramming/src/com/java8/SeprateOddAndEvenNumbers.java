package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class SeprateOddAndEvenNumbers {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(2, 4, 5, 6, 7, 8, 9);

		Map<Boolean, List<Integer>> oddAndEvenNumMap = numbers.stream()
				.collect(Collectors.partitioningBy(i -> i % 2 == 0));

		Set<Entry<Boolean, List<Integer>>> entrySet = oddAndEvenNumMap.entrySet();

		for (Entry<Boolean, List<Integer>> value : entrySet) {

			if (value.getKey()) {
				System.out.println("Even Numbers : ");
			} else {
				System.out.println("Odd Numbers : ");
			}

			for (Integer intValue : value.getValue()) {
				System.out.println(intValue);

			}
		}
	}
}
