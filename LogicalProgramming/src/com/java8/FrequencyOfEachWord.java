package com.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class FrequencyOfEachWord {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book",
				"Pencil");

		Map<String, Long> frqOfwrd = listOfString.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(frqOfwrd);
	}
}
