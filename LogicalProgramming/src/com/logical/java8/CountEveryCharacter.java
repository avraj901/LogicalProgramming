package com.logical.java8;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import java.util.*;

public class CountEveryCharacter {

	public static void main(String[] args) {

		String str = "ilovejavatechie";

		Map<String, Long> output = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(output);

		// all duplicate element

		List<String> result = output.entrySet().stream().filter(i -> i.getValue() > 1).map(Map.Entry::getKey)
				.collect(Collectors.toList());

		System.out.println(result);

		// Find Unique Elemnetas

		List<String> unique = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(i -> i.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());

		System.out.println(unique);

		// First non repeat element

		String firstKey = Arrays.stream(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(i -> i.getValue() == 1).findFirst().get().getKey();

		System.out.println(firstKey);

	}

}
