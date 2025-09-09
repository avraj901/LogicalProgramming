package com.logical.program;

public class FindSecondLargestWithoutSorting {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 9, 7, 6 };
		int temp = 0;
		int secondmax = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] < arr[j]) {

					if (temp <= arr[j]) {

						temp = arr[j];
					}
					if (temp > arr[j]) {
						secondmax = arr[j];
						if (secondmax <= arr[j]) {

							secondmax = arr[j];
						}

					}

				}

			}
		}
		System.out.println("firstmax::" + temp);
		System.out.println("secondmax" + secondmax);
	}

}
