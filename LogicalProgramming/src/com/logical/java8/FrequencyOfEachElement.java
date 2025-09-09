package com.logical.java8;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Map;

public class FrequencyOfEachElement {

	public static void main(String[] args) {

		List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler",
				"Note Book", "Pencil");

		Map<String, Long> output = stationeryList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		output.entrySet().stream().forEach(ent -> System.out.println(ent.getKey() + "::" + ent.getValue()));

	}

}
