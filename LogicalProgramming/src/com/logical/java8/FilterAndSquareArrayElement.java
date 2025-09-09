package com.logical.java8;
import java.util.Arrays;

public class FilterAndSquareArrayElement {

	public static void main(String[] args) {

		int[] b = new int[] { 3, 0, 5, 1 };

		int[] output = Arrays.stream(b).sorted().filter(i -> i > 0).map(num -> num == 5 ? 5 : num * 2).toArray();

		System.out.print(Arrays.toString(output));
	}
}
