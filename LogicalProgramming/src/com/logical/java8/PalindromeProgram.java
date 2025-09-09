package com.logical.java8;
import java.util.stream.*;
import java.util.*;

public class PalindromeProgram {

	public static void main(String[] args) {

		Integer number = 121;

		String strNumber = number.toString();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter input String");

		String inputString = sc.nextLine();

		/*
		 * Boolean palindrome = IntStream.range(0, strNumber.length() / 2) .allMatch(i
		 * -> strNumber.charAt(i) == strNumber.charAt(strNumber.length() - i - 1));
		 */

		Boolean palindrome = IntStream.range(0, inputString.length() / 2)
				.allMatch(i -> inputString.charAt(i) == inputString.charAt(inputString.length() - i - 1));

		if (palindrome) {
			System.out.println("palindrome number");
		} else {
			System.out.println("Not a palindrome number");
		}

	}

}
