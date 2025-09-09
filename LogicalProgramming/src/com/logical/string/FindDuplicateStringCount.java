package com.logical.string;

public class FindDuplicateStringCount {

	public static void main(String[] args) {
		
		String name = "Great responsibility";
		
		char[] charArray = name.toCharArray();

		for (int i = 0; i < name.length(); i++) {
			int count = 1;
			for (int j = i + 1; j < name.length(); j++) {

				if (charArray[i] == charArray[j] && charArray[i] != ' ') {

					count++;

					charArray[j] = '0';

				}

			}
			if (count > 1 && charArray[i] != '0') {

				System.out.println(charArray[i] + " : " + count);
			}

		}
	}

}
