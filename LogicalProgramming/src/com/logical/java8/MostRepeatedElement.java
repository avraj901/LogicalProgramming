package com.logical.java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatedElement {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("Pen", "ERASER", "Note Book", "Pen", "Note Book", "Pencil","Pen");

		Map<String, Long> repeatedWords = listOfStrings.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(repeatedWords);

		Entry<String, Long> mostRepeatedWords = repeatedWords.entrySet().stream().max(Map.Entry.comparingByValue())
				.get();

		System.out.println(mostRepeatedWords.getKey() + "::::" + mostRepeatedWords.getValue());
	}

}
