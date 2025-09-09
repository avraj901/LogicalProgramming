package com.logical.string;

public class ReverseStringRecursion {

	public static void main(String[] args) {
		String input = "hello";
		String reversed = reverse(input);
		System.out.println("Original: " + input);
		System.out.println("Reversed: " + reversed);
	}

	public static String reverse(String str) {
		// base case
		if (str == null || str.length() <= 1) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
