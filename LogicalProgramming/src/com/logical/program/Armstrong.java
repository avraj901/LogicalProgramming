package com.logical.program;

public class Armstrong {

	public static void main(String[] args) {

		int number = 153;
		int sum = 0;
		while (number != 0) {
			int remainder = number % 10;
			sum = sum + (remainder * remainder * remainder);
			number = number / 10;
		}
		System.out.println("sum :: " + sum);
	}

}
