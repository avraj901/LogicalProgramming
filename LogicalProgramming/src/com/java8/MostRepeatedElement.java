package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedElement {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book",
				"Pencil");

		Map<String, Long> countMap = listOfString.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		Entry<String, Long> mostRepeatedEntry = countMap.entrySet().stream().max(Map.Entry.comparingByValue()).get();

		System.out.println(mostRepeatedEntry.getKey() + "::" + mostRepeatedEntry.getValue());
	}

}
