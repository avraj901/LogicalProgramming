package com.logical.program;

public class FibonacciSeries {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;

		for (int i = 1; i < 10; i++) {
			int next = first + second;
			first = second;
			second = next;
			System.out.println(next);
		}

	}

}
