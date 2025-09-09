package com.logical.java8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {

	public static void main(String[] args) {

		int[] intArray = new int[] { 5, 1, 7, 3, 9, 6 };

		// sort method is used for sorting not to reverse the order
		Object[] sortedArray = Arrays.stream(intArray).boxed().sorted(Comparator.reverseOrder()).toArray();

		System.out.print(Arrays.toString(sortedArray));

		// Below logic is for reverse the order

		int[] reverseOrder = IntStream.range(0, intArray.length).map(i -> intArray[intArray.length - i - 1]).toArray();

		System.out.println(Arrays.toString(reverseOrder));

	}

}
