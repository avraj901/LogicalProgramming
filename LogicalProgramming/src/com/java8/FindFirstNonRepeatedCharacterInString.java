package com.java8;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacterInString {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

		Map<String, Long> countMap = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

		Entry<String, Long> entry = countMap.entrySet().stream().filter(ent -> ent.getValue() == 1).findFirst().get();

		System.out.println(entry);
	}

}
