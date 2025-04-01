package com.logical;

public class ReverseEachWordOfString {

	public static void main(String[] args) {

		String str = "Hello World";

		String[] strArr = str.split(" ");

		StringBuilder sb= new StringBuilder();
		for (String word : strArr) {

			for(int i=word.length()-1; i>=0 ; i--) {
				
				sb.append(word.charAt(i));
			}
			sb.append(" ");
					
		}
		System.out.println(sb.toString());
	}
}
