package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeTwoArrayIntoSingleArray {

	public static void main(String[] args) {

		int[] a = { 5, 2, 3, 4 };
		int[] b = { 1, 6, 7, 8, 9 };

		int[] c = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();

		System.out.println(Arrays.toString(c));
	}
}
