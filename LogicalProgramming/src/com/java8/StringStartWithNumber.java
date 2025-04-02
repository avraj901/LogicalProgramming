package com.java8;

import java.util.Arrays;

import java.util.List;

public class StringStartWithNumber {

	public static void main(String[] args) {

		List<String> listOfStrings = Arrays.asList("one", "2wo", "3ree");

		listOfStrings.stream().filter(str -> Character.isDigit(str.charAt(0))).forEach(System.out::println);
	}

}
