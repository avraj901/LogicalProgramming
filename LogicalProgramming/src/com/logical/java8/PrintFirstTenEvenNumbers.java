package com.logical.java8;
import java.util.stream.IntStream;

public class PrintFirstTenEvenNumbers {

	public static void main(String[] args) {

		IntStream.rangeClosed(1, 10).map(num -> num * 2).forEach(System.out::println);
	}

}
