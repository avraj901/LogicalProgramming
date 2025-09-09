package com.logical.string;
import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		
		String input = "HELLO";
		
		StringBuilder sb = new StringBuilder(input).reverse();
		
		System.out.print(sb);

	}

}
