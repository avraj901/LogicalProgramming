package com.java8;

import java.util.stream.IntStream;

public class PalindromeProgram {

	public static void main(String[] args) {

		String str = "ROTATOR";

		String[] str1 = str.split("");

		boolean palindrome = IntStream.range(0, str.length() / 2)
				.allMatch(i -> str.charAt(i) == str.charAt(str.length() - i - 1));

		System.out.println("string is palindrome : " + palindrome);

		boolean flag = IntStream.range(0, str.length() / 2).allMatch(i -> str1[i].equals(str1[str.length() - i - 1]));

		System.out.println("palindrome :: " + flag);

	}

}
