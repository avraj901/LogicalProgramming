package com.logical.java8;
import java.util.Arrays;

public class FindSumAndAverage {

	public static void main(String[] args) {

		int[] a = new int[] { 1, 2, 3, 4, 5, 6, 7 };

		int max = Arrays.stream(a).max().getAsInt();

		System.out.println(max);

		int min = Arrays.stream(a).min().getAsInt();

		System.out.println(min);

		double average = Arrays.stream(a).average().getAsDouble();

		System.out.println(average);

	}

}
