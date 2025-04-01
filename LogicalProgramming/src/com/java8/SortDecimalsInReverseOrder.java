package com.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortDecimalsInReverseOrder {

	public static void main(String[] args) {

		List<Double> listOfDecimals = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

		listOfDecimals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
	
	}

}
