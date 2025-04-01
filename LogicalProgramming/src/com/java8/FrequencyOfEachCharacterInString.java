package com.java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.Function;
import java.util.Map;

public class FrequencyOfEachCharacterInString {

	public static void main(String[] args) {

		String str = "java is object oriented";

		Map<String, Long> countMap = Stream.of(str.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(countMap);

		// Second Approach

		Map<Character, Long> frqOfStr = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(frqOfStr);
	}
}
