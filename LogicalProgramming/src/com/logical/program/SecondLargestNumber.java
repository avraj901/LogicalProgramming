package com.logical.program;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int array[] = { 10, 20, 30, 35, 20 };
		findNumber(array);
	}

	public static void findNumber(int arry[]) {

		int size = arry.length;
		int temp;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (arry[i] > arry[j]) {
					temp = arry[i];
					arry[i] = arry[j];
					arry[j] = temp;

				}
			}

		}
		System.out.println("Second Largest Element :" + arry[size - 2]);
	}

}
