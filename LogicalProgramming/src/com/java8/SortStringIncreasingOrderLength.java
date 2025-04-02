package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortStringIncreasingOrderLength {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

		listOfString.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

	}

}
