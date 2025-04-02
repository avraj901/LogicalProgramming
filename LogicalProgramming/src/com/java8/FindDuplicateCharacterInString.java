package com.java8;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.HashSet;

public class FindDuplicateCharacterInString {

	public static void main(String[] args) {

		String str = "Java Concept Of The Day";

		System.out.println(str.replaceAll("\\s", ""));

		System.out.println(str.replaceAll("\\s+", ""));

		String str1 = str.replaceAll("\\s", "").toLowerCase();

		Set<String> uniqueChar = new HashSet<>();

		Set<String> str2 = Arrays.stream(str1.split("")).filter(ch -> !uniqueChar.add(ch)).collect(Collectors.toSet());

		System.out.println(str2);
	}

}
