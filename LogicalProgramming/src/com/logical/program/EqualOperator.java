package com.logical.program;

public class EqualOperator {

	public static void main(String[] args) {
		Integer a = 1000;
		Integer b = 1000;

		int a1 = new Integer(100);
		int b1 = new Integer(100);

		Integer a2 = new Integer(100);
		Integer b2 = new Integer(100);

		System.out.println(a == b);
		System.out.println(a1 == b1);
		System.out.println(a2 == b2);
	}

}
