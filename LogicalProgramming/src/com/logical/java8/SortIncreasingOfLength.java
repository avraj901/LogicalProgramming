package com.logical.java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortIncreasingOfLength {

	public static void main(String[] args) {

		List<String> listOfString = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "c++", "COBOL", "C");

		List<String> outPut = listOfString.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());

		System.out.println(outPut);
	}

}
