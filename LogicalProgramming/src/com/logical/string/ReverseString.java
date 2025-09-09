package com.logical.string;

public class ReverseString {

	public static void main(String[] args) {
		String name = "avanish";

		char[] charArray = name.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {

			System.out.print(charArray[i]);
		}

	}

}
