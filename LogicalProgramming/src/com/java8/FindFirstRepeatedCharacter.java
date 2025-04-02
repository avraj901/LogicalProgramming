package com.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstRepeatedCharacter {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		System.out.println(inputString);

		Map<String, Long> countMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Entry<String, Long> firestRepeatedEnty = countMap.entrySet().stream().filter(entry -> entry.getValue() > 1)
				.findFirst().get();

		System.out.println(firestRepeatedEnty);
	}

}
