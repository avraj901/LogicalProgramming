package com.logical.java8;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;

public class ShortDecimalsInReverseOrder {

	public static void main(String[] args) {

		List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

		List<Double> result = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.print(result);

	}

}
