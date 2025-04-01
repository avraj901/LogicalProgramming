package com.logical;

public class ReplaceSpecialCharacter {

	public static void main(String[] args) {

		String str = "#j$a!v%a&*%()#";

		str = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(str);
	}
}
