package com.logical.program;

public class DivideStringInTwoParts {

	public static void main(String[] args) {
		String name = "HelloWorld";
		String first = "";
		String second = "";

		for (int i = 0; i < name.length(); i++) {

			if (i < name.length() / 2) {

				first += name.charAt(i);
			} else {
				second += name.charAt(i);
			}
		}

		System.out.println(first);
		System.out.println(second);
	}

}
