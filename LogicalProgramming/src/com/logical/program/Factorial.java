package com.logical.program;

public class Factorial {

	public static void main(String[] args) {
		long result = getFactorial(5);

		System.out.println("Factorial of 5 : " + result);
	}

	public static long getFactorial(int n) {

		long fact = 1;

		for (int i = 1; i <= n; i++) {

			fact = fact * i;

		}
		return fact;
	}
}
