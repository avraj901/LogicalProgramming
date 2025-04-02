package com.java8;

import java.util.stream.Stream;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "Java is Object Oriented";

		Stream.of(str.split(" ")).map(word -> new StringBuilder(word).reverse()).forEach(System.out::println);

		//
		
	}

}
