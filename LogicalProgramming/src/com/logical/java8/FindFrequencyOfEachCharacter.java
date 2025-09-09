package com.logical.java8;
import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Map;

public class FindFrequencyOfEachCharacter {

	public static void main(String[] args) {

		String inputString = "Java Concept Of The Day";

		Map<String, Long> outPut = Arrays.stream(inputString.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		outPut.entrySet().stream().forEach(i -> System.out.println(i.getKey() + "" + i.getValue()));

		System.out.println(outPut);

	}

}
