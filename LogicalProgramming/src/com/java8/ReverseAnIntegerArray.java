package com.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseAnIntegerArray {

	public static void main(String[] args) {

		int[] intArray = new int[] { 5, 1, 7, 3, 9, 6 };

		IntStream.rangeClosed(1, intArray.length)
		.map(i -> intArray[intArray.length - i]).forEach(System.out::println);
		
	int[] reversedArray =	IntStream.rangeClosed(1, intArray.length).map( i -> intArray[intArray.length - i]).toArray();
	
	System.out.println(Arrays.toString(reversedArray));
	
	}
	
	

}
