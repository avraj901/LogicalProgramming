package com.logical.java8;
import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "Java Concept of The Day";

		StringBuilder sb = new StringBuilder(str);
		System.out.println(sb.reverse());

		Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse()).forEach(System.out::println);

		String reversedStr = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse())
				.collect(Collectors.joining(" "));

		System.out.print(reversedStr);
	}

}
