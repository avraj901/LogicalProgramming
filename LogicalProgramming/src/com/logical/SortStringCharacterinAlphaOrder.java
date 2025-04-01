package com.logical;

public class SortStringCharacterinAlphaOrder {

	public static void main(String[] args) {

		String str = "java";

		char temp;

		char[] chrArr = str.toCharArray();

		for (int i = 0; i < chrArr.length; i++) {

			for (int j = i + 1; j < chrArr.length; j++) {

				if (chrArr[i] > chrArr[j]) {

					temp = chrArr[i];
					chrArr[i] = chrArr[j];
					chrArr[j] = temp;
				}
			}
		}
		
		System.out.println(chrArr);
	}
}
