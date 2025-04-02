package com.java8;

import java.util.stream.Stream;
import java.util.stream.Collectors;

public class TwoStringAnagram {

	public static void main(String[] args) {

		String str1 = "RaceCar";
		String str2 = "CarRace";

		String firstResult = Stream.of(str1.split("")).map(s -> s.toUpperCase()).sorted().collect(Collectors.joining());

		String secondResult = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		if (firstResult.equals(secondResult)) {

			System.out.println("String is anagarm :" + str1);
		} else {

			System.out.println("string is not anagram :" + str1);
		}
	}
}
